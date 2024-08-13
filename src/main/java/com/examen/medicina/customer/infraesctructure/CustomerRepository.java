package com.examen.medicina.customer.infraesctructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.medicina.customer.application.CustomerRepositoryPort;
import com.examen.medicina.customer.model.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>,CustomerRepositoryPort {
    
}
