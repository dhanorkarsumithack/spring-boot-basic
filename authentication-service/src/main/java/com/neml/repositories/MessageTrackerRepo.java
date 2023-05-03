package com.neml.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neml.entities.MessageTracker;

public interface MessageTrackerRepo extends JpaRepository<MessageTracker,Long> {

}

