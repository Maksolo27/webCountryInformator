package com.country.webcountryproj.controller;

import com.country.webcountryproj.domains.Country;
import com.country.webcountryproj.service.CountryService;
import com.country.webcountryproj.service.CountryServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/compare")
public class CompareController {

    private CountryServiceImpl countryService;
    private Country firstCurrentCountry, secondCurrentCountry;

    public CompareController(CountryServiceImpl countryService){
        this.countryService = countryService;
        this.firstCurrentCountry = countryService.getCountryByCode("AUS");
        this.secondCurrentCountry = countryService.getCountryByCode("AGO");
    }

    @GetMapping()
    public String getCompare(Model model, @RequestParam(required = false) String firstCode, @RequestParam(required = false) String secondCode){
        System.out.println("get");
        Country firstCompareCountry, secondCompareCountry;
        if(firstCode == null){
            firstCompareCountry = countryService.getCountryByCode(firstCurrentCountry.getCode());
        }else {
            firstCompareCountry = countryService.getCountryByCode(firstCode);
        }
        if(secondCode == null){
            secondCompareCountry = countryService.getCountryByCode(secondCurrentCountry.getCode());
        }else {
            secondCompareCountry = countryService.getCountryByCode(secondCode);
        }
        model.addAttribute("firstCountry", firstCompareCountry);
        model.addAttribute("secondCountry", secondCompareCountry);
        return "country_compare";
    }

    @PostMapping
    public String setCompare(Country firstCountryWithCode, Country secondCountryWithCode){
        System.out.println("post");
        System.out.println(firstCountryWithCode);
        System.out.println(secondCountryWithCode);
        firstCurrentCountry = countryService.getCountryByCode(parseCountryCode(firstCountryWithCode.getCode(), true));
        System.out.println(firstCurrentCountry);
        secondCurrentCountry = countryService.getCountryByCode(parseCountryCode(secondCountryWithCode.getCode(), false));
        System.out.println(secondCurrentCountry);
        return "redirect:/compare?firstCode=" + firstCurrentCountry.getCode() + "&secondCode=" + secondCurrentCountry.getCode();
    }

    private String parseCountryCode(String code, boolean isFirst){
        String[] codes = code.split(",");
        if(isFirst){
            return codes[0];
        }else {
            return codes[1];
        }
    }


}
