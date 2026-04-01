package com.ironhack.jpahibernatelab.repositories;

import com.ironhack.jpahibernatelab.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FlightRepository extends JpaRepository<Flight , Integer> {

    List<Integer> findByflightId(Flight flightId);
}
