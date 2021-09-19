package com.hiryx.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.*;

@Entity
public class Account {

    private @Id String email;
    private String names;
    private String firstnames;
    private Location birthplace;
    private Date birthdate;
    private Location location;
    private boolean passportHolder;
    private String phone;

    public Account(String email, String names, String firstnames, Location birthplace, Date birthdate,
            Location location, boolean passportHolder, String phone) {
        this.email = email;
        this.names = names;
        this.firstnames = firstnames;
        this.birthdate = birthdate;
        this.birthplace = birthplace;
        this.location = location;
        this.passportHolder = passportHolder;
        this.phone = phone;
    }

    public Account(String email, String names, String firstnames, String birthplace, Date birthdate, String location,
            boolean passportHolder, String phone) {
        this.email = email;
        this.names = names;
        this.firstnames = firstnames;
        this.birthdate = birthdate;
        this.birthplace = birthplace;
        this.location = location;
        this.passportHolder = passportHolder;
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

}