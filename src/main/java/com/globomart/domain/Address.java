package com.globomart.domain;

import javax.persistence.*;

/**
 * Created by rajeshkumar on 03/06/17.
 */

@Entity
public class Address {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String addressLine1;
    @Column
    private String addressLine2;
    @Column
    private String addressLine3;

    @OneToOne
    private AddressType addressType;
    @OneToOne
    private City city;
    @OneToOne
    private State state;
    @OneToOne
    private Country country;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(final AddressType addressType) {
        this.addressType = addressType;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(final String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(final String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(final String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public City getCity() {
        return city;
    }

    public void setCity(final City city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(final State state) {
        this.state = state;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(final Country country) {
        this.country = country;
    }


}
