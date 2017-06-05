package com.globomart.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by rajeshkumar on 03/06/17.
 */
@Entity
public class Invoice {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private Date invoiceDate;
    @Column
    private double tax;
    @Column
    private double amount;

    @OneToOne
    private CustomerOrder customerOrder;
    @OneToOne
    private InvoiceStatus invoiceStatus;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(final CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }

    public InvoiceStatus getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(final InvoiceStatus invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(final Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(final double tax) {
        this.tax = tax;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(final double amount) {
        this.amount = amount;
    }
}
