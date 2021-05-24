package com.country.webcountryproj.service;

import com.country.webcountryproj.domains.CountryLanguage;

import java.util.List;

public interface CountryLanguageService {

    List<CountryLanguage> getCountryLanguageByCountryCode(String code);
}
