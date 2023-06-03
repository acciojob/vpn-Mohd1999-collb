// package com.driver.model;

// import java.util.*;
// import javax.annotation.processing.Generated;
// import javax.persistence.*;

// @Entity
// @Table(name="Connection")
// public class Connection {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private int id;

//     @ManyToOne
//     @JoinColumn
//     ServiceProvider serviceProvider;

//     @ManyToOne
//     @JoinColumn
//     User user;

//     public Connection(){}

//     public Connection(int id, ServiceProvider serviceProvider, User user){
//         this.id = id;
//         this.serviceProvider = serviceProvider;
//         this.user = user;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public int getId() {
//         return id;
//     }

//     public void setServiceProvider(ServiceProvider serviceProvider) {
//         this.serviceProvider = serviceProvider;
//     }

//     public ServiceProvider getServiceProvider() {
//         return serviceProvider;
//     }

//     public void setUser(User user) {
//         this.user = user;
//     }

//     public User getUser() {
//         return user;
//     }
    
// }


package com.driver.model;

import javax.persistence.*;

@Entity
@Table(name = "Connection")
public class Connection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn
    private ServiceProvider serviceProvider;

    @ManyToOne
    @JoinColumn
    private User user;

    public Connection() {
    }

    public Connection(int id, ServiceProvider serviceProvider, User user) {
        this.id = id;
        this.serviceProvider = serviceProvider;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
