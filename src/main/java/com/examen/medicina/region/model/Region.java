package com.examen.medicina.region.model;

import java.util.List;

import com.examen.medicina.city.model.City;
import com.examen.medicina.country.model.Country;
import com.fasterxml.jackson.annotation.JsonBackReference;
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
public class Region {
    @Id
    @Column(length=5)
    private String codereg;

    @Column(length=50)
    private String namereg;

    @ManyToOne
    @JsonBackReference
    private Country codecountry;
    
    @OneToMany
    @JsonManagedReference
    private List<City> cities;
    
}
