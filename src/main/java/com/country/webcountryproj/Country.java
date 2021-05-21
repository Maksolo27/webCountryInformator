package com.country.webcountryproj;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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

}
