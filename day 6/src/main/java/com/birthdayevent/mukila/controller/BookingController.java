package com.birthdayevent.mukila.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.birthdayevent.mukila.dto.request.BookingRequest;
import com.birthdayevent.mukila.dto.response.BookingResponse;
import com.birthdayevent.mukila.model.Booking;
import com.birthdayevent.mukila.service.BookingService;

import static org.springframework.http.HttpStatus.ACCEPTED;
import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;

import org.springframework.http.HttpStatus;
import java.util.*;
@RestController
@RequestMapping("/bookings")
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;

    @PostMapping("/create")
    public ResponseEntity<BookingResponse> createBooking(@RequestBody BookingRequest request) {
        BookingResponse response = new BookingResponse();
        try {
            response = bookingService.createBooking(request);
            return new ResponseEntity<>(response, ACCEPTED);
        } catch (Exception e) {
            response.setMessage("Something went wrong!");
            return new ResponseEntity<>(response, EXPECTATION_FAILED);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<Booking>> getAllBookings() {
        List<Booking> bookings = bookingService.getAllBookings();
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }
 
    @DeleteMapping("/delete/{userId}")
    public void deleteBooking(@PathVariable Long userId){
        bookingService.deleteBooking(userId);
    }
    @GetMapping("/get-by-user/{userId}")
    public List<Booking> getBookingsByUserId(@PathVariable String userId) {
        return bookingService.getBookingsByUserId(userId);
    }

    @GetMapping("/total")
    public Long getTotalBookingsCount() {
        return bookingService.getTotalBookingsCount();
    }

}
