package com.examen.medicina.city.model;


import java.util.List;

import com.examen.medicina.customer.model.Customer;
import com.examen.medicina.farmacy.model.Farmacy;
import com.examen.medicina.labatory.model.Labatory;
import com.examen.medicina.region.model.Region;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class City {
    @Id
    @Column(length=5)
    private String codecity;

    @Column(length=50)
    private String namecity;

    @ManyToOne
    private Region codereg;

    @OneToMany
    @JsonManagedReference
    private List<Customer> customers;

    @OneToMany
    @JsonManagedReference
    private List<Farmacy> farmacies;

    @OneToMany
    @JsonManagedReference
    private List<Labatory> laboratories;


    public City(String namecity) {
        this.namecity = namecity;
    }
}
