package com.examen.medicina.farmacymedicine.model;


import com.examen.medicina.farmacy.model.Farmacy;
import com.examen.medicina.medicine.model.Medicine;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class Farmacymedicine {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idfarmacymedicine;

    @ManyToOne
    @JsonBackReference
    private Farmacy idfarmacy;
    
    @ManyToOne
    @JsonBackReference
    private Medicine idmedicinefatrm;

    private float price;
}
