package com.globomart.domain;

import java.util.Set;

/**
 * Created by rajeshkumar on 04/06/17.
 */
public class WishList {

    private long id;
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
