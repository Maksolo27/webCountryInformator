package com.country.webcountryproj;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component
@NoArgsConstructor
public class Countries {
    private List<Country> countryList = new ArrayList<>();


    public List<Country> getAll(){
            return countryList;
    }

    public void addCountry(Country country){
        countryList.add(country);
    }

    public boolean isEmpty(){
        return countryList.isEmpty();
    }
}
