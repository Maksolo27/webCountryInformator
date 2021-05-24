package com.country.webcountryproj.service;

import com.country.webcountryproj.domains.CountryLanguage;
import com.country.webcountryproj.repository.CountryLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.LinkedList;
import java.util.List;

@Service
public class CountryLanguageServiceImpl implements CountryLanguageService {

    @Autowired
    private CountryLanguageRepository repository;

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<CountryLanguage> getCountryLanguageByCountryCode(String code) {
        List<CountryLanguage> countryLanguageList = repository.findAll();
        System.out.println(countryLanguageList);
        List<CountryLanguage> resList = new LinkedList<>();
        for (int i = 0; i < countryLanguageList.size(); i++) {
            if (countryLanguageList.get(i).getCountrycode().equals(code)) {
                resList.add(countryLanguageList.remove(i));
            }
        }
        return resList;
    }
}
