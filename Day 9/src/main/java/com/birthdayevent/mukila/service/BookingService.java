package com.birthdayevent.mukila.service;

import java.util.List;

import com.birthdayevent.mukila.dto.request.BookingRequest;
import com.birthdayevent.mukila.dto.response.BookingResponse;
import com.birthdayevent.mukila.model.Booking;

public interface BookingService {
    BookingResponse createBooking(BookingRequest request);
    List<Booking> getAllBookings();
    // List<Booking> getusersidebookings(String userid);
    void deleteBooking(Long userId);
    // String getUsernameByUserId(String userIds);
    List<Booking> getBookingsByUserId(String userId) ;
    Long getTotalBookingsCount();

}
