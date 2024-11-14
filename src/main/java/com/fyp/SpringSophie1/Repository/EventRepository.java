package com.fyp.SpringSophie1.Repository;


import com.fyp.SpringSophie1.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, String> {


}
