package com.examen.medicina.customer.application;

import java.util.List;
import java.util.Optional;

import com.examen.medicina.customer.model.Customer;

public interface CustomerRepositoryPort {

    Customer save(Customer customer);

    Optional<Customer> findById(String id);
    
    void deleteById(String id);

    List<Customer> findAll();
}
