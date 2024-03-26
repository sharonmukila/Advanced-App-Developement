package com.birthdayevent.mukila.service.impl;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.birthdayevent.mukila.dto.request.BookingRequest;
import com.birthdayevent.mukila.dto.response.BookingResponse;
import com.birthdayevent.mukila.model.Booking;
import com.birthdayevent.mukila.model.User;
import com.birthdayevent.mukila.repository.BookingRepository;
import com.birthdayevent.mukila.repository.UserRepository;
import com.birthdayevent.mukila.service.BookingService;

import lombok.RequiredArgsConstructor;
import java.util.*;
@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;
    private final UserRepository userRepository;


    @Override
    public BookingResponse createBooking(BookingRequest request) {
       
        String userId = request.getUserId();
        String venueId = request.getVenueId();

        Booking booking = Booking.builder()
                .noOfPersons(request.getNoOfPersons())
                .ondate(request.getOnDate())
             
                .userId(userId)
                .venueId(venueId)
                .eventType(request.getEventType())
                .paymentStatus(request.getPaymentStatus())
                .build();

        bookingRepository.save(booking); 

        return BookingResponse.builder()
                .message("Booking created successfully!")
                .build();
    }
    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public void deleteBooking(Long userId){
        bookingRepository.deleteById(userId);
    }
    @Override
    public List<Booking> getBookingsByUserId(String userId) {
        return bookingRepository.findByUserId(userId);
    }

    @Override
    public Long getTotalBookingsCount() {
        return bookingRepository.count();
    }


}
     