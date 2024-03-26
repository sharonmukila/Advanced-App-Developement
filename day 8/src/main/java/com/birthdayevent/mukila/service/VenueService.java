package com.birthdayevent.mukila.service;

import java.util.List;

import com.birthdayevent.mukila.dto.request.VenueRequest;
import com.birthdayevent.mukila.dto.response.VenueResponse;
import com.birthdayevent.mukila.model.Venue;

public interface VenueService {
    VenueResponse createVenue(VenueRequest request);

    List<Venue> getAllVenues();

    void deleteVenue(Long venueId);


    

}
