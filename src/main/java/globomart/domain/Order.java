package globomart.domain;

import java.util.Date;
import java.util.Set;

/**
 * Created by rajeshkumar on 03/06/17.
 */
public class Order {

    private long id;
    private OrderStatus orderStatus;
    private Date orderDate;
    private Set<OrderItem> orderItems;
    private Customer customer;
    private Payment payment;

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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(final Customer customer) {
        this.customer = customer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(final Payment payment) {
        this.payment = payment;
    }
}
