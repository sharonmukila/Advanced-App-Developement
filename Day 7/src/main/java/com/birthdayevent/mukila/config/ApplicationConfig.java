package com.birthdayevent.mukila.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.birthdayevent.mukila.repository.UserRepository;

import lombok.RequiredArgsConstructor;



@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {
    private final UserRepository userRepository;
    @Bean
public UserDetailsService userDetailsService(){
    return username ->userRepository.findByEmail(username)
    .orElseThrow(() -> new UsernameNotFoundException("username not found"));
       
    }

@Bean
public PasswordEncoder passwordencoder(){
    return new BCryptPasswordEncoder();
}
@Bean
public AuthenticationProvider authenticationProvider()
{
 DaoAuthenticationProvider authProvider=new DaoAuthenticationProvider();
 authProvider.setUserDetailsService(userDetailsService());
 authProvider.setPasswordEncoder(passwordencoder());
 return authProvider;
}
@Bean
public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception{
    return authenticationConfiguration.getAuthenticationManager();

}

}
