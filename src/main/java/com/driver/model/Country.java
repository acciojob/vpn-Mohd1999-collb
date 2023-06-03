// Note: Do not write @Enumerated annotation above CountryName in this model.

package com.driver.model;

import java.util.List;

import javax.persistence.*;
import javax.annotation.processing.Generated;

@Entity
@Table(name="Country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private CountryName countryName;

    private String code;

    @ManyToOne
    @JoinColumn
    ServiceProvider serviceProvider;

    @OneToOne
    @JoinColumn
    User user;

    public Country(){}

    public Country(int id, String code, CountryName countryName, ServiceProvider serviceProvider, User user){
        this.id = id;
        this.code = code;
        this.countryName = countryName;
        this.serviceProvider = serviceProvider;
        this.user = user;
    }


    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCountryName(CountryName countryName) {
        this.countryName = countryName;
    }
    
    public CountryName getCountryName() {
        return countryName;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }    
}