package com.country.webcountryproj.controller;

import com.country.webcountryproj.domains.City;
import com.country.webcountryproj.service.CityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/city")

public class CityController {


    private CityServiceImpl cityService;
    private City currentCity;
    private CountryController countryController;

    @Autowired
    public CityController(CityServiceImpl cityService, CountryController countryController){
        this.cityService = cityService;
        this.countryController = countryController;
        this.currentCity = cityService.getCityByName("Haag");
    }

    @GetMapping()
    public String getCountry(Model model){
        City city;
        city = cityService.getCityByName(currentCity.getName());
        System.out.println(city.getCountrycode());
        model.addAttribute("code", city.getCountrycode());
        model.addAttribute("city", city);
        return "city";
    }

    @PostMapping()
    public String getCountryById(City city){
        currentCity = city;
        return "redirect:/city";
    }

}
