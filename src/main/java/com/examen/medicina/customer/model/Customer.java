package com.examen.medicina.customer.model;


import java.time.LocalDate;

import com.examen.medicina.city.model.City;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    @Column(length=20)
    private String idcustomer;

    private String namecustomer;

    private String lastnamecustomer;

    private String codecitycustomer;

    private String emailcustomer    ;

    private LocalDate birthdate;

    private float lon;

    private float latitud;

    @ManyToOne
    @JsonBackReference
    private City city;
}
