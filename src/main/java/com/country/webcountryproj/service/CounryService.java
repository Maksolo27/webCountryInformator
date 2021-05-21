package com.country.webcountryproj.service;

import com.country.webcountryproj.Country;

public interface CounryService {
    Country getCountryByCode(String code);
}
