// package com.driver.model;

// import java.util.*;

// import javax.annotation.processing.Generated;
// import javax.persistence.*;

// @Entity
// @Table(name="ServiceProvider")
// public class ServiceProvider {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id;

//     private String name;


//     @ManyToOne
//     @JoinColumn
//     Admin admin;

//     @OneToMany(mappedBy="serviceProvider", cascade = CascadeType.ALL)
//     List<Connection> connections = new ArrayList<>();


//     @OneToMany(mappedBy="serviceProvider", cascade = CascadeType.ALL)
//     List<Country> countries = new ArrayList<>();

//     @ManyToMany
//     @JoinColumn
//     List<User> users = new ArrayList<>();


//     public ServiceProvider(){
//     }

//     public ServiceProvider(int id, String name, Admin admin, List<Connection> connections, List<Country> countries, List<User> users){
//         this.id = id;
//         this.name = name;
//         this.admin = admin;
//         this.connections = connections;
//         this.countries = countries;
//         this.users = users;
//     }


//     public void setUsers(List<User> users) {
//         this.users = users;
//     }

//     public List<User> getUsers() {
//         return users;
//     }

//     public void setCountries(List<Country> countries) {
//         this.countries = countries;
//     }

//     public List<Country> getCountries() {
//         return countries;
//     }

//     public void setConnections(List<Connection> connections) {
//         this.connections = connections;
//     }

//     public List<Connection> getConnections() {
//         return connections;
//     }


//     public void setId(int id) {
//         this.id = id;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public void setAdmin(Admin admin) {
//         this.admin = admin;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     public Admin getAdmin() {
//         return admin;
//     }
       
// }



package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ServiceProvider")
public class ServiceProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToOne
    @JoinColumn
    private Admin admin;

    @OneToMany(mappedBy = "serviceProvider", cascade = CascadeType.ALL)
    List<Connection> connectionList = new ArrayList<>();

    @ManyToMany
    @JoinColumn
    List<User> users = new ArrayList<>();

    @OneToMany(mappedBy = "serviceProvider", cascade = CascadeType.ALL)
    List<Country> countryList = new ArrayList<>();

    public ServiceProvider() {
    }

    public ServiceProvider(int id, String name, Admin admin, List<Connection> connectionList, List<User> users, List<Country> countryList) {
        this.id = id;
        this.name = name;
        this.admin = admin;
        this.connectionList = connectionList;
        this.users = users;
        this.countryList = countryList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public List<Connection> getConnectionList() {
        return connectionList;
    }

    public void setConnectionList(List<Connection> connectionList) {
        this.connectionList = connectionList;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<Country> countryList) {
        this.countryList = countryList;
    }
}