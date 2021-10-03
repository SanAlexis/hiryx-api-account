package com.hiryx.api.account.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Alexis
 */
@Entity
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final String email;
    
    private final String names;
    private final String firstnames;
    private final Location birthplace;
    private final Date birthdate;
    private final Location location;
    private final boolean passportHolder;
    private final String phone;

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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (email != null ? email.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.hiryx.api.account.entities.Account[ email=" + email 
                + " --  names = "+ names
                +"]";
    }
    
}
