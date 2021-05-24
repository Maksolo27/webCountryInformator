package com.country.webcountryproj.domains;

import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@ToString
public class Country {
    @Id
    private String code;
    @Column
    private String name;
    @Column
    private String continent;
    @Column
    private String region;
    @Column
    private double surfacearea;
    @Column
    private int indepyear;
    @Column
    private int population;
    @Column
    private double lifeexpectancy;
    @Column
    private int GNP;
    @Column
    private int GNPOld;
    @Column
    private String localname;
    @Column
    private String governmentform;
    @Column
    private String headofstate;
    @Column
    private String capital;
    @Column
    private String code2;

    public Country(String code){
        this.code = code;
    }

}
