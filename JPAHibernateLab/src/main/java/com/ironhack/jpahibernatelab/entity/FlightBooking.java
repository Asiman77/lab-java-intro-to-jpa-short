package com.ironhack.jpahibernatelab.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "flight_bookings")
public class FlightBooking {

    @Id
    @GeneratedValue
    private Integer bookingId;

    @Column(name = "customer_id")
    private Integer customerId;

    public FlightBooking(Integer bookingId, Integer customerId) {
        this.bookingId = bookingId;
        this.customerId = customerId;
    }

    @Column(name = "flight_id")
    private Integer flightId;

    public FlightBooking() {

    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }
}
