package com.ironhack.jpahibernatelab.repositories;


import com.ironhack.jpahibernatelab.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer , Integer> {

}
