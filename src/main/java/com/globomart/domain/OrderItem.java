package com.globomart.domain;

/**
 * Created by rajeshkumar on 03/06/17.
 */
public class OrderItem {
    private long id;
    private Product product;
    private Order order;
    private long quantity;
    private double price;
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

    public Order getOrder() {
        return order;
    }

    public void setOrder(final Order order) {
        this.order = order;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(final long quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public OrderItemStatus getOrderItemStatus() {
        return orderItemStatus;
    }

    public void setOrderItemStatus(final OrderItemStatus orderItemStatus) {
        this.orderItemStatus = orderItemStatus;
    }
}
