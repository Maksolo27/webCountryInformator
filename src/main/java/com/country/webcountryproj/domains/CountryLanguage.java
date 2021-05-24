package com.country.webcountryproj.domains;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity()
@Table(name = "countrylanguage")
@Data
@NoArgsConstructor
public class CountryLanguage {

    @Id
    private String countrycode;
    @Column
    private String language;
    @Column
    private String isofficial;
    @Column
    private double percentage;
}
