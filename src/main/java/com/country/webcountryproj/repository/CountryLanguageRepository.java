package com.country.webcountryproj.repository;

import com.country.webcountryproj.domains.CountryLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface CountryLanguageRepository extends CrudRepository<CountryLanguage, String>, JpaRepository<CountryLanguage, String> {

}
