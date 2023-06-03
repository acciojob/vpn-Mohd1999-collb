// // Note: Do not write @Enumerated annotation above CountryName in this model.

// package com.driver.model;

// import java.util.*;

// import javax.persistence.*;
// import javax.annotation.processing.Generated;

// @Entity
// @Table(name="Country")
// public class Country {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id;

//     private CountryName countryName;

//     private String code;

//     @ManyToOne
//     @JoinColumn
//     ServiceProvider serviceProvider;

//     @OneToOne
//     @JoinColumn
//     User user;

//     public Country(){}

//     public Country(int id, String code, CountryName countryName, ServiceProvider serviceProvider, User user){
//         this.id = id;
//         this.code = code;
//         this.countryName = countryName;
//         this.serviceProvider = serviceProvider;
//         this.user = user;
//     }


//     public void setUser(User user) {
//         this.user = user;
//     }

//     public User getUser() {
//         return user;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public int getId() {
//         return id;
//     }

//     public void setCode(String code) {
//         this.code = code;
//     }

//     public String getCode() {
//         return code;
//     }

//     public void setCountryName(CountryName countryName) {
//         this.countryName = countryName;
//     }
    
//     public CountryName getCountryName() {
//         return countryName;
//     }

//     public void setServiceProvider(ServiceProvider serviceProvider) {
//         this.serviceProvider = serviceProvider;
//     }

//     public ServiceProvider getServiceProvider() {
//         return serviceProvider;
//     }    
// }


// Note: Do not write @Enumerated annotation above CountryName in this model.

package com.driver.model;


import com.driver.model.CountryName;

import javax.persistence.*;

@Entity
@Table(name = "Country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private CountryName countryName;

    private String code;

    @OneToOne
    @JoinColumn
    private User user;

    @ManyToOne
    @JoinColumn
    private ServiceProvider serviceProvider;

    public Country() {
    }

    public Country(int id, CountryName countryName, String code, User user, ServiceProvider serviceProvider) {
        this.id = id;
        this.countryName = countryName;
        this.code = code;
        this.user = user;
        this.serviceProvider = serviceProvider;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CountryName getCountryName() {
        return countryName;
    }

    public void setCountryName(CountryName countryName) {
        this.countryName = countryName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}