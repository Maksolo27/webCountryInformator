package com.country.webcountryproj;

import com.country.webcountryproj.controller.CityController;
import com.country.webcountryproj.domains.City;
import com.country.webcountryproj.domains.Country;
import com.country.webcountryproj.service.CityServiceImpl;
import com.country.webcountryproj.service.CountryServiceImpl;
import lombok.SneakyThrows;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.Assert;

import static org.assertj.core.api.Assertions.assertThat;

@WebMvcTest
class WebCountryProjApplicationTests {
    @MockBean
    private CityServiceImpl cityService;

    @Autowired
    private MockMvc mockMvc;


    @Test
    @SneakyThrows
    public void testCityService(){
        City haag = cityService.getCityByName("Haag");
        City city = new City();
        city.setName("Haag");
        assertThat(haag.getName()).isEqualTo(city.getName());
    }

}
