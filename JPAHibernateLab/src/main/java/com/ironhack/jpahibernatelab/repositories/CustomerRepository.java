package com.ironhack.jpahibernatelab.repositories;


import com.ironhack.jpahibernatelab.entity.Customer;
import com.ironhack.jpahibernatelab.entity.entityEnums.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer , Integer> {

    List<Customer> findByCustomerStatus(CustomerStatus status);
}
