package com.globomart.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by rajeshkumar on 03/06/17.
 */
@Entity
public class Shipment {
    @Id
    @GeneratedValue
    private long id;
    @OneToOne
    private Invoice invoice;
    @Column
    private Date shipmentDate;
    @OneToOne
    private Address address;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(final Invoice invoice) {
        this.invoice = invoice;
    }

    public Date getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(final Date shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }
}
