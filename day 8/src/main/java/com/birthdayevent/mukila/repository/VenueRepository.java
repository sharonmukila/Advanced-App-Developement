package com.birthdayevent.mukila.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.birthdayevent.mukila.model.Venue;

public interface VenueRepository extends JpaRepository<Venue, Long> {

}
