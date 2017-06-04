package com.globomart.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Created by rajeshkumar on 04/06/17.
 */
@Entity
public class WishList {
    @Id
    @GeneratedValue
    private long id;
    @OneToMany
    private Set<Product> products;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(final Set<Product> products) {
        this.products = products;
    }
}
