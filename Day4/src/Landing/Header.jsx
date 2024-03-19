import React from 'react';
import { useNavigate } from 'react-router-dom';

const Header = () => {
    const navigate = useNavigate();

    const handleLoginClick = () => {
     
      navigate('/login');
     
      };
    const handleRegisterClick = () => {
     
     
      navigate('/register');
      };
  return (
   
    <header id="header">
    
      <input type="checkbox" id="toggle-menu" role="button" />
      <label for="toggle-menu" class="toggle-menu">Menu</label>
      <div className='logReg'>
      <button onClick={handleLoginClick}>Login</button>
      </div>
      <div className='logReg2'>

      <button onClick={handleRegisterClick}>Register</button>
      </div>
            
        
            
 
      <nav id="nav-bar" class="navbar">
        <ul class="menu">
        
          <li><a class="nav-link" Link to="#OurServices">Our Services</a></li>
          <li><a class="nav-link" href="#collections">Gallery</a></li>
          <li><a class="nav-link" href="#about">About</a></li>
          <li><a class="nav-link" href="#contact">Contact</a></li>
        </ul>
        <ul class="social-menu">
          <li><a href="#"><i class="fa fa-pinterest" aria-hidden="true"></i></a></li>
          <li><a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
          <li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
          <li><a href="#"><i class="fa fa-youtube-play" aria-hidden="true"></i></a></li>
        </ul>
      </nav>
    </header>
  );
};

export default Header;