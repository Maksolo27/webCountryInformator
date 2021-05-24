package com.country.webcountryproj.repository;

import com.country.webcountryproj.domains.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, String>, JpaRepository<Country, String> {
    Country getCountryByCode(String code);
}
