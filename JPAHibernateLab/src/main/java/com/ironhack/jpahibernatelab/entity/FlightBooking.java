package com.ironhack.jpahibernatelab.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "flight_bookings")
public class FlightBooking {

    @Id
    @GeneratedValue
    private Integer bookingId;



    @JoinColumn(name = "customer_id")
    private Customer customer;

    @JoinColumn(name = "flight_id")
    private Flight flight;

    public FlightBooking() {

    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
