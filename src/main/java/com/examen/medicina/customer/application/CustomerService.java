package com.examen.medicina.customer.application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.medicina.customer.model.Customer;

@Service
public class CustomerService {
    

    @Autowired
    private CustomerRepositoryPort customerRepositoryPort;

    public CustomerDTO save(CustomerDTO customerDTO){
        System.out.println("CustomerDTO: "+customerDTO);
        Customer customer = DTOToEntity(customerDTO);
        customer = customerRepositoryPort.save(customer);
        return EntityToDTO(customer);
    }

    public CustomerDTO findById(String id){
        Customer customer = customerRepositoryPort.findById(id).get();
        return EntityToDTO(customer);
    }

    public void deleteById(String id){
        customerRepositoryPort.deleteById(id);
    }

    public List<CustomerDTO> findAll(){
        List<Customer> customers = customerRepositoryPort.findAll();
        List<CustomerDTO> customersDTO = new ArrayList<>();
        for (Customer customer : customers) {
            customersDTO.add(EntityToDTO(customer));
        }
        return customersDTO;
    }

    public CustomerDTO update(CustomerDTO customerDTO){
        Customer customer = DTOToEntity(customerDTO);
        customer = customerRepositoryPort.save(customer);
        return EntityToDTO(customer);
    }



    public CustomerDTO EntityToDTO(Customer customer){
        return CustomerDTO.builder()
        .idcustomer(customer.getIdcustomer())
        .namecustomer(customer.getNamecustomer())
        .lastnamecustomer(customer.getLastnamecustomer())
        .codecitycustomer(customer.getCodecitycustomer())
        .emailcustomer(customer.getEmailcustomer())
        .birthdate(customer.getBirthdate().toString())
        .lon(customer.getLon())
        .latitud(customer.getLatitud())
        .city(customer.getCity().getNamecity())
        .build();
    }

    public Customer DTOToEntity(CustomerDTO customerDTO){
        return Customer.builder()
        .idcustomer(customerDTO.getIdcustomer())
        .namecustomer(customerDTO.getNamecustomer())
        .lastnamecustomer(customerDTO.getLastnamecustomer())
        .codecitycustomer(customerDTO.getCodecitycustomer())
        .emailcustomer(customerDTO.getEmailcustomer())
        .birthdate(java.sql.Date.valueOf(customerDTO.getBirthdate()))
        .lon(customerDTO.getLon())
        .latitud(customerDTO.getLatitud())
        .build();
    }

    
}
