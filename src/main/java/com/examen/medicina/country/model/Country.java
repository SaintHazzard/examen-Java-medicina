package com.examen.medicina.country.model;

import java.util.List;

import com.examen.medicina.region.model.Region;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
public class Country {
    
    @Column(length=5)
    @Id
    private String codecountry;
    
    @Column(length=50)
    private String namecountry;

    @OneToMany
    @JsonManagedReference
    private List<Region> regiones;
}
