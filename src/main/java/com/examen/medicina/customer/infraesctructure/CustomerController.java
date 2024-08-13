package com.examen.medicina.customer.infraesctructure;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.medicina.customer.application.CustomerDTO;
import com.examen.medicina.customer.application.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;


    @GetMapping("/getAll")
    public ResponseEntity<List<CustomerDTO>> getAll(){
        return ResponseEntity.ok(customerService.findAll());
    }


    @GetMapping("/getById")
    public ResponseEntity<CustomerDTO> getById(String id){
        return ResponseEntity.ok(customerService.findById(id));
    }


    @PostMapping("/save")
    public ResponseEntity<CustomerDTO> save(@RequestBody CustomerDTO customerDTO){
        System.out.println("CustomerDTO: "+customerDTO);
        return ResponseEntity.ok(customerService.save(customerDTO));
    }

    @PutMapping("/update")
    public ResponseEntity<CustomerDTO> update(@RequestBody CustomerDTO customerDTO){
        return ResponseEntity.ok(customerService.update(customerDTO));
    }
}
