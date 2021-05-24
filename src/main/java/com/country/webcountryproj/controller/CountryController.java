package com.country.webcountryproj.controller;

import com.country.webcountryproj.domains.Country;
import com.country.webcountryproj.domains.CountryLanguage;
import com.country.webcountryproj.service.CountryLanguageServiceImpl;
import com.country.webcountryproj.service.CountryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/index")
public class CountryController {

    private CountryServiceImpl countryService;
    private CountryLanguageServiceImpl countryLanguageService;
    private Country currentCountry;

    @Autowired
    public CountryController(CountryServiceImpl countryService, CountryLanguageServiceImpl countryLanguageService){
        this.countryService = countryService;
        this.countryLanguageService = countryLanguageService;
        this.currentCountry = countryService.getCountryByCode("AUS");
    }

    @GetMapping()
    public String getCountry(Model model){
        System.out.println("get");
        Country country;
        List<CountryLanguage> countryLanguages = countryLanguageService.getCountryLanguageByCountryCode(currentCountry.getCode());
        country = countryService.getCountryByCode(currentCountry.getCode());
        System.out.println(countryLanguages);
        model.addAttribute("languageList", countryLanguages);
        model.addAttribute("country", country);
        return "index";
    }

    @PostMapping()
    public String getCountryById(Country country){
        currentCountry = country;
        return "redirect:/index";
    }

}
