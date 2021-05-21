package com.country.webcountryproj.service;

import com.country.webcountryproj.Country;
import com.country.webcountryproj.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CounryService {

    @Autowired
    private CountryRepository repository;

    @Override
    public Country getCountryByCode(String code) {
        return repository.getCountryByCode(code);
    }
}
