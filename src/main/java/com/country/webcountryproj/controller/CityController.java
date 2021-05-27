package com.country.webcountryproj.controller;

import com.country.webcountryproj.domains.City;
import com.country.webcountryproj.service.CityServiceImpl;
import com.country.webcountryproj.service.CountryService;
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
    private CountryService countryService;

    @Autowired
    public CityController(CityServiceImpl cityService, CountryService countryService){
        this.cityService = cityService;
        this.countryService = countryService;
        this.currentCity = cityService.getCityByName("Haag");
    }

    @GetMapping()
    public String getCity(Model model){
        City city;
        city = cityService.getCityByName(currentCity.getName());
        String countryName = countryService.getCountryByCode(city.getCountrycode()).getName();
        model.addAttribute("countryName", countryName);
        model.addAttribute("city", city);
        return "city";
    }

    @PostMapping()
    public String getCityById(City city){
        currentCity = city;
        return "redirect:/city";
    }

}
