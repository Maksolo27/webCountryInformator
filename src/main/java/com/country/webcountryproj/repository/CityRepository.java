package com.country.webcountryproj.repository;

import com.country.webcountryproj.domains.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends JpaRepository<City, Long>, CrudRepository<City, Long> {
    City getCityByName(String name);
}
