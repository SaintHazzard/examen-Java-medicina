package com.examen.medicina.unitmeasurement.model;

import java.util.List;

import com.examen.medicina.medicine.model.Medicine;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Unitmeasurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idum;

    @Column(length=50)
    private String nameenum;

    @OneToMany
    @JsonManagedReference
    private List<Medicine> medicines;
}