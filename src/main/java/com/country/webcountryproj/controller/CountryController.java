package com.country.webcountryproj.controller;

import com.country.webcountryproj.Country;
import com.country.webcountryproj.service.CountryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class CountryController {

    private CountryServiceImpl countryService;
    private Country currentCountry;

    @Autowired
    public CountryController(CountryServiceImpl countryService){
        this.countryService = countryService;
        this.currentCountry = countryService.getCountryByCode("AUS");
    }

    @GetMapping()
    public String getCountry(Model model){
        System.out.println("get");
        Country country;
        country = countryService.getCountryByCode(currentCountry.getCode());
        model.addAttribute("country", country);
        return "index";
    }

    @PostMapping()
    public String getCountryById(Country country){
        currentCountry = country;
        return "redirect:/index";
    }

}
