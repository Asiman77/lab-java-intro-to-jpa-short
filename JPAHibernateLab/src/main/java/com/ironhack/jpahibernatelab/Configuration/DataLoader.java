package com.ironhack.jpahibernatelab.Configuration;

import com.ironhack.jpahibernatelab.entity.Customer;
import com.ironhack.jpahibernatelab.entity.Flight;
import com.ironhack.jpahibernatelab.entity.FlightBooking;
import com.ironhack.jpahibernatelab.entity.entityEnums.CustomerStatus;
import com.ironhack.jpahibernatelab.repositories.CustomerRepository;
import com.ironhack.jpahibernatelab.repositories.FlightBookingRepository;
import com.ironhack.jpahibernatelab.repositories.FlightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(CustomerRepository customerRepo,
                               FlightRepository flightRepo,
                               FlightBookingRepository bookingRepo) {
        return args -> {

            Customer c1 = new Customer("John Doe", CustomerStatus.GOLD, 50000);
            Customer c2 = new Customer("Jane Smith", CustomerStatus.SILVER, 30000);
            Customer c3 = new Customer("Michael Brown", CustomerStatus.NONE, 20000);

            customerRepo.save(c1);
            customerRepo.save(c2);
            customerRepo.save(c3);

            Flight f1 = new Flight("AA101", 4444, "NNNNN", 1000);
            Flight f2 = new Flight("BA202", 3333, "MMMM", 2000);
            Flight f3 = new Flight("LH303", 5555, "TTTT", 3500);

            flightRepo.save(f1);
            flightRepo.save(f2);
            flightRepo.save(f3);

            FlightBooking b1 = new FlightBooking(c1.getCustomerID(), f1.getFlightId());
            FlightBooking b2 = new FlightBooking(c2.getCustomerID(), f2.getFlightId());
            FlightBooking b3 = new FlightBooking(c3.getCustomerID(), f3.getFlightId());

            bookingRepo.save(b1);
            bookingRepo.save(b2);
            bookingRepo.save(b3);
        };
    }
}