// package com.driver.model;

// import java.util.List;

// import javax.persistence.*;
// import javax.annotation.processing.Generated;

// @Entity
// @Table(name="Admin")
// public class Admin {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id;

//     private String userName;

//     private String password;

//     @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
//     List<ServiceProvider> serviceProviders  = new ArrayList<>();

//     public Admin(){    
//     }

//     public Admin(int id, String userName, String password, List<ServiceProvider> serviceProviders
//     ){
//         this.id = id;
//         this.userName = userName;
//         this.password = password;
//         this.serviceProviders = serviceProviders;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }   

//     public void setUserName(String userName) {
//         this.userName = userName;
//     }

//     public void setPassword(String password) {
//         this.password = password;
//     }    

//     public void setServiceProviders(List<ServiceProvider> serviceProviders) {
//         this.serviceProviders = serviceProviders;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getUserName() {
//         return userName;
//     }

//     public String getPassword() {
//         return password;
//     }    

//     public List<ServiceProvider> getServiceProviders() {
//         return serviceProviders;
//     }
// }


package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    private String password;

    @OneToMany(mappedBy = "admin", cascade = CascadeType.ALL)
    List<ServiceProvider> serviceProviders = new ArrayList<>();

    public Admin() {
    }

    public Admin(int id, String username, String password, List<ServiceProvider> serviceProviders) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.serviceProviders = serviceProviders;
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

    public List<ServiceProvider> getServiceProviders() {
        return serviceProviders;
    }

    public void setServiceProviders(List<ServiceProvider> serviceProviders) {
        this.serviceProviders = serviceProviders;
    }
}