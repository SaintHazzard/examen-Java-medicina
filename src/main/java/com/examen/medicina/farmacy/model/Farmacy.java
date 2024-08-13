package com.examen.medicina.farmacy.model;


import java.util.List;

import com.examen.medicina.city.model.City;
import com.examen.medicina.farmacymedicine.model.Farmacymedicine;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class Farmacy {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idfarmacy;

    @Column(length=60)
    private String namefarmacy;

    @Column(length=60)
    private String addressfarmacy;

    private float longfarmacy;

    private float latfarmacy;

    

    @Column(length=50)
    private String logofarmacy; 
    


    @ManyToOne
    @JsonBackReference
    private City codecityfarm;

    @OneToMany
    @JsonManagedReference
    private List<Farmacymedicine> farmacymedicines;
}
