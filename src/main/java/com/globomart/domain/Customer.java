package com.globomart.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by rajeshkumar on 03/06/17.
 */
@Entity
public class Customer {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @ManyToOne
    private Gender gender;
    @Column
    private String email;
    @Column
    private Date dateOfBirth;
    @Column
    private String contactPhone;

    @OneToOne
    private LoginUser loginUser;
    @OneToMany
    private Set<Address> addresses;
    @OneToMany
    private Set<WishList> wishLists;
    @OneToMany
    private Set<CustomerOrder> orders;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(final Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(final Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(final String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public LoginUser getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(final LoginUser loginUser) {
        this.loginUser = loginUser;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(final Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Set<WishList> getWishLists() {
        return wishLists;
    }

    public void setWishLists(final Set<WishList> wishLists) {
        this.wishLists = wishLists;
    }

    public Set<CustomerOrder> getOrders() {
        return orders;
    }

    public void setOrders(final Set<CustomerOrder> orders) {
        this.orders = orders;
    }
}
