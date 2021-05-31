package com.country.webcountryproj.controller;

import com.country.webcountryproj.domains.Country;
import com.country.webcountryproj.service.CountryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/country")
public class CountryController {

    private CountryServiceImpl countryService;
    private Country currentCountry;


    @Autowired
    public CountryController(CountryServiceImpl countryService){
        this.countryService = countryService;
        this.currentCountry = countryService.getCountryByCode("AUS");
    }


    @GetMapping()
    public String getCountry(Model model, @RequestParam(required = false)String code){
        Country country;
        if(code != null){
            country = countryService.getCountryByCode(code);
        }else {
            country = countryService.getCountryByCode(currentCountry.getCode());
        }
        model.addAttribute("country", country);
        return "country";
    }

    @PostMapping()
    public String getCountryById(Country country){
        currentCountry = country;
        return "redirect:/country";
    }

}
