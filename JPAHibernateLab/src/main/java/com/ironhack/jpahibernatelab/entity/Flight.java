package com.ironhack.jpahibernatelab.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue
    @Column(name = "flight_id")
    private Integer flightId;

    @Column(unique = true)
    private String flightNumber;

    private String aircraft;

    private Integer totalAircraftSeats;

    private Integer flightMileage;

    public Flight() {

    }

    public Flight(String aircraft, Integer flightMileage, String flightNumber, Integer totalAircraftSeats) {
        this.aircraft = aircraft;
        this.flightMileage = flightMileage;
        this.flightNumber = flightNumber;
        this.totalAircraftSeats = totalAircraftSeats;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public Integer getFlightMileage() {
        return flightMileage;
    }

    public void setFlightMileage(Integer flightMileage) {
        this.flightMileage = flightMileage;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Integer getTotalAircraftSeats() {
        return totalAircraftSeats;
    }

    public void setTotalAircraftSeats(Integer totalAircraftSeats) {
        this.totalAircraftSeats = totalAircraftSeats;
    }
}
