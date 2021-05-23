package com.country.webcountryproj.controller;

import com.country.webcountryproj.Country;
import com.country.webcountryproj.service.CountryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping()
@RequiredArgsConstructor
public class CountryController {

    @Autowired
    private CountryServiceImpl countryService;
    private Country currCountry;


    @PostMapping("/inPindex")
    public String postCountry(Country country){
        currCountry = countryService.getCountryByCode(country.getCode());
        return "index";
    }

    @GetMapping("/index")
    public String getCountry(Model model){
        System.out.println("get");
        Country country = countryService.getCountryByCode(currCountry.getCode());
        model.addAttribute("country", country);
        return "index";
    }

}
