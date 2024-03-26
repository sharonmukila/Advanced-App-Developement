package com.birthdayevent.mukila.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.birthdayevent.mukila.model.Event;

public interface EventRepository extends JpaRepository<Event,Long> {

}
