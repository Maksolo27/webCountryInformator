package com.country.webcountryproj.service;

import com.country.webcountryproj.domains.Country;
import com.country.webcountryproj.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository repository;


    @Override
    public Country getCountryByCode(String code) {
        return repository.getCountryByCode(code);
    }

/*    @Override
    public List<CountryLanguage> getCountryLanguages(String code) {
        String queryString = "SELECT * FROM countrylanguage WHERE countrycode = " + code;
        Query query = entityManager.createNativeQuery(queryString);
        List resultList = query.getResultList();
        List<CountryLanguage> languages = new ArrayList<>();
        if (!resultList.isEmpty()) {
            CountryLanguage countryLanguage = new CountryLanguage();
            String countryCode = (String) resultList.get(0);
            String language = (String) resultList.get(1);
            boolean isOfficial = (boolean) resultList.get(2);
            double percentage = (double) resultList.get(3);
            countryLanguage.setCode(countryCode);
            countryLanguage.setLanguage(language);
            countryLanguage.setIsofficial(isOfficial);
            countryLanguage.setPercentage(percentage);
        }

        return languages;
    }*/
}
