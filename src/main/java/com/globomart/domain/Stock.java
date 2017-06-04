package com.globomart.domain;

import javax.persistence.*;

/**
 * Created by rajeshkumar on 04/06/17.
 */
@Entity
public class Stock {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private long count;

    @OneToOne
    private Product product;

    @OneToOne
    private Store store;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public long getCount() {
        return count;
    }

    public void setCount(final long count) {
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(final Product product) {
        this.product = product;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(final Store store) {
        this.store = store;
    }
}
