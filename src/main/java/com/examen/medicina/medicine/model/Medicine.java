package com.examen.medicina.medicine.model;


import java.util.List;

import com.examen.medicina.activeprinciple.model.Activeprinciple;
import com.examen.medicina.farmacymedicine.model.Farmacymedicine;
import com.examen.medicina.labatory.model.Labatory;
import com.examen.medicina.modeadministration.model.Modeadministration;
import com.examen.medicina.unitmeasurement.model.Unitmeasurement;
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
public class Medicine {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(length=10)
    private String proceedings;

    @Column(length=100)
    private String namemedicina;

    @Column(length=50)
    private String healthregister;

    private String description;

    private String descriptionshort;


    @ManyToOne
    private Modeadministration codemodeadmin;

    @ManyToOne
    private Activeprinciple codeap;

    @ManyToOne
    private Unitmeasurement codeum;

    @ManyToOne
    private Labatory codelab;

    @OneToMany
    @JsonManagedReference
    private List<Farmacymedicine> medicines;

    @Column(length=100)
    private String namerol;

}
