package com.ironhack.jpahibernatelab.repositories;

import com.ironhack.jpahibernatelab.entity.Flight;
import com.ironhack.jpahibernatelab.entity.FlightBooking;
import org.hibernate.sql.exec.spi.JdbcCallParameterExtractor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FlightBookingRepository extends JpaRepository<FlightBooking , Integer> {

    List<FlightBooking> findByCustomerId(Integer customerId);
}
