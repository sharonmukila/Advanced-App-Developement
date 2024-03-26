package com.birthdayevent.mukila.service;

import java.util.List;

import com.birthdayevent.mukila.dto.request.EventRequest;
import com.birthdayevent.mukila.dto.response.EventResponse;
import com.birthdayevent.mukila.model.Event;

public interface EventService {
    EventResponse createEvent(EventRequest request);

    List<Event> getAllEvents();

    EventResponse deleteEvent(Long Id);

    EventResponse updateEvent(Long Id, EventRequest request);

    Long countEvents();

}
