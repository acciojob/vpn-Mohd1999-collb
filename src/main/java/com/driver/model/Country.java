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

    private Country country;

    private String code;

    @ManyToOne
    @JoinColumn
    ServiceProvider serviceProvider;

    @OneToOne
    @JoinColumn
    User user;

    public Country(){}

    public Country(int id, String code, Country country, ServiceProvider serviceProvider, User user){
        this.id = id;
        this.code = code;
        this.country = country;
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

    public void setCountry(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }


    
}