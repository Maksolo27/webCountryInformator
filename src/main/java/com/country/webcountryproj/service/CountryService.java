package com.country.webcountryproj.service;

import com.country.webcountryproj.domains.Country;

public interface CountryService {

    Country getCountryByCode(String code);

    /*List<CountryLanguage> getCountryLanguages(String code);*/

}
