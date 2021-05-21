package com.country.webcountryproj.controller;

import com.country.webcountryproj.Countries;
import com.country.webcountryproj.Country;
import com.country.webcountryproj.service.CounryService;
import com.country.webcountryproj.service.CountryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/countries")
@RequiredArgsConstructor
public class CountryController {

    @Autowired
    private CountryServiceImpl counryService;


    @GetMapping
    public String getCountryByCode(Model model){
        Country country = counryService.getCountryByCode("CRI");
        model.addAttribute("country", country);
        return "index";
    }
}
