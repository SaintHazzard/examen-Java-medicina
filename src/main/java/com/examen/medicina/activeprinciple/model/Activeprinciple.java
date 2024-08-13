package com.examen.medicina.activeprinciple.model;



import java.util.List;

import com.examen.medicina.medicine.model.Medicine;

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
public class Activeprinciple {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idap;

    @Column(length=60)
    private String nameap;


    @OneToMany
    private List<Medicine> medicines;

}
