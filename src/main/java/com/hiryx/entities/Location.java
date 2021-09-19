package com.hiryx.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.*;

@Entity
public class Location {
    private @Id @GeneratedValue long id;
    private String country;
    private String town;
    private String region;
    private String place;

    public Location(String country, String region, String town, String place) {
        this.country = country;
        this.region = region;
        this.town = town;
        this.place = place;
    }

    public getCountry(){
        
    }

}
