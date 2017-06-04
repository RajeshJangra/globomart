package com.globomart.domain;

/**
 * Created by rajeshkumar on 03/06/17.
 */
public class City {
    private long id;
    private String name;
    private State state;

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

    public State getState() {
        return state;
    }

    public void setState(final State state) {
        this.state = state;
    }
}
