package com.globomart.domain;

/**
 * Created by rajeshkumar on 03/06/17.
 */
public class State {
    private long id;
    private String name;

    private Country country;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(final Country country) {
        this.country = country;
    }

}