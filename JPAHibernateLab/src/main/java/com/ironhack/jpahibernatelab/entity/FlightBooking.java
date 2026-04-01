package com.ironhack.jpahibernatelab.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "flightbookings")
public class FlightBooking {

    @Id
    @GeneratedValue
    private Integer bookingId;


    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customerId;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flightId;

    public FlightBooking() {

    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Flight getFlightId() {
        return flightId;
    }

    public void setFlightId(Flight flightId) {
        this.flightId = flightId;
    }
}
