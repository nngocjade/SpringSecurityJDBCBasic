package com.javasampleapproach.springsecurity.jdbcauthentication.model;

/**
 * Created by ryandesmond on 7/24/18.
 */
public class Animal {

    String species;
    boolean isPet;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String isPet() {
        return "true";
    }

    public void setPet(boolean pet) {
        isPet = pet;
    }
}
