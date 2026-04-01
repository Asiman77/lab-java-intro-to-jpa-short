package com.ironhack.jpahibernatelab.repositories;

import org.hibernate.sql.exec.spi.JdbcCallParameterExtractor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FlightBookingRepository extends JpaRepository {

}
