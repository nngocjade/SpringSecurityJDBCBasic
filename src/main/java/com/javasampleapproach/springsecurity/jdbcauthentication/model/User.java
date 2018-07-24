package com.javasampleapproach.springsecurity.jdbcauthentication.model;

/**
 * Created by ryandesmond on 7/24/18.
 */
public class User {

    String username;
    String password;
    String enabled;
    Animal animal;


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

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
