package com.globomart.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by rajeshkumar on 03/06/17.
 */
@Entity
public class CustomerOrder {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private Date orderDate;
    @Column
    private double amount;
    @ManyToOne
    private OrderStatus orderStatus;
    @OneToMany
    private Set<OrderItem> orderItems;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(final OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(final Date orderDate) {
        this.orderDate = orderDate;
    }

    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(final Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(final double amount) {
        this.amount = amount;
    }
}
