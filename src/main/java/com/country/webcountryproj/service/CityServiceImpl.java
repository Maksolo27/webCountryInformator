package com.country.webcountryproj.service;

import com.country.webcountryproj.domains.City;
import com.country.webcountryproj.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityRepository repository;

    @Override
    public City getCityByName(String name) {
        return repository.getCityByName(name);
    }
}
