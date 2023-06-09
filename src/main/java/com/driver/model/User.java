// package com.driver.model;

// import javax.annotation.processing.Generated;
// import javax.persistence.*;

// import java.util.*;

// @Entity
// @Table(name="User")
// public class User {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id;

//     private String userName;

//     private String password;

//     private String originalIp;

//     private String maskedIp;

//     Boolean connected;
    

    
//     @OneToMany(mappedBy="user", cascade = CascadeType.ALL)
//     List<Connection> connections = new ArrayList<>();

//     @OneToOne(mappedBy="user", cascade = CascadeType.ALL)
//     Country country;

//     @ManyToMany
//     @JoinColumn
//     private List<ServiceProvider> serviceProviderList;

//     public User(){}

//     public User(int id, String userName, String password, String originalIp, String maskedIp, Boolean connected,
//     List<Connection> connections, Country country, List<ServiceProvider> serviceProviderList){
//         this.id = id;
//         this.userName = userName;
//         this.password = password;
//         this.originalIp = originalIp;
//         this.maskedIp = maskedIp;
//         this.connected = connected;
//         this.connections = connections;
//         this.country = country;
//         this.serviceProviderList = serviceProviderList;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }
//     public int getId() {
//         return id;
//     }

//     public void setUserName(String userName) {
//         this.userName = userName;
//     }
//     public String getUserName() {
//         return userName;
//     }


//     public void setPassword(String password) {
//         this.password = password;
//     }
//     public String getPassword() {
//         return password;
//     }

//     public void setOriginalIp(String originalIp) {
//         this.originalIp = originalIp;
//     }
//     public String getOriginalIp() {
//         return originalIp;
//     }

//     public void setMaskedIp(String maskedIp) {
//         this.maskedIp = maskedIp;
//     }
//     public String getMaskedIp() {
//         return maskedIp;
//     }

//     public void setConnected(Boolean connected) {
//         this.connected = connected;
//     }
//     public Boolean getConnected() {
//         return connected;
//     }

//     public void setConnections(List<Connection> connections) {
//         this.connections = connections;
//     }
//     public List<Connection> getConnections() {
//         return connections;
//     }

//     public void setCountry(Country country) {
//         this.country = country;
//     }
//     public Country getCountry() {
//         return country;
//     }

//     public void setServiceProviderList(List<ServiceProvider> serviceProviderList) {
//         this.serviceProviderList = serviceProviderList;
//     }
//     public List<ServiceProvider> getServiceProviderList() {
//         return serviceProviderList;
//     }    
// }


package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;
    private String originalIp;
    private String maskedIp;
    private Boolean connected;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Connection> connectionList;

    @ManyToMany
    @JoinColumn
    private List<ServiceProvider> serviceProviderList;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Country originalCountry;


    public User() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOriginalIp() {
        return originalIp;
    }

    public void setOriginalIp(String originalIp) {
        this.originalIp = originalIp;
    }

    public String getMaskedIp() {
        return maskedIp;
    }

    public void setMaskedIp(String maskedIp) {
        this.maskedIp = maskedIp;
    }

    public Boolean getConnected() {
        return connected;
    }

    public void setConnected(Boolean connected) {
        this.connected = connected;
    }

    public List<Connection> getConnectionList() {
        return connectionList;
    }

    public void setConnectionList(List<Connection> connectionList) {
        this.connectionList = connectionList;
    }

    public List<ServiceProvider> getServiceProviderList() {
        return serviceProviderList;
    }

    public void setServiceProviderList(List<ServiceProvider> serviceProviderList) {
        this.serviceProviderList = serviceProviderList;
    }

    public Country getOriginalCountry() {
        return originalCountry;
    }

    public void setOriginalCountry(Country originalCountry) {
        this.originalCountry = originalCountry;
    }
}