package globomart.domain;

import java.util.Date;
import java.util.Set;

/**
 * Created by rajeshkumar on 03/06/17.
 */
public class Shipment {
    private long id;
    private Set<Order> orders;
    private Invoice invoice;
    private Date date;
    private Address address;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(final Set<Order> orders) {
        this.orders = orders;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(final Invoice invoice) {
        this.invoice = invoice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(final Date date) {
        this.date = date;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }
}
