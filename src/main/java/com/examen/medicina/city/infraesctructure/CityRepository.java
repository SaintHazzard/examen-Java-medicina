package com.examen.medicina.city.infraesctructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.medicina.city.model.City;

@Repository
public interface  CityRepository extends JpaRepository<City, String> {
    
}
