package com.globomart.domain;

import javax.persistence.*;

/**
 * Created by rajeshkumar on 03/06/17.
 */
@Entity
public class OrderItem {
    @Id
    private long id;
    @OneToOne
    private Product product;
    @Column
    private long quantity;
    @ManyToOne
    private OrderItemStatus orderItemStatus;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(final Product product) {
        this.product = product;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(final long quantity) {
        this.quantity = quantity;
    }

    public OrderItemStatus getOrderItemStatus() {
        return orderItemStatus;
    }

    public void setOrderItemStatus(final OrderItemStatus orderItemStatus) {
        this.orderItemStatus = orderItemStatus;
    }
}
