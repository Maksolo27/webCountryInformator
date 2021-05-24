package com.country.webcountryproj.service;

import com.country.webcountryproj.domains.Country;
import com.country.webcountryproj.domains.CountryLanguage;

import java.util.List;

public interface CountryService {

    Country getCountryByCode(String code);

    /*List<CountryLanguage> getCountryLanguages(String code);*/

}
