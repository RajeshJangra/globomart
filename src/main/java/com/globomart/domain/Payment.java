package com.globomart.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by rajeshkumar on 04/06/17.
 */
@Entity
public class Payment {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String transactionId;
    @Column
    private Date paymentDate;
    @Column
    private double amount;

    @OneToOne
    private PaymentMethod paymentMethod;
    @ManyToOne
    private PaymentStatus paymentStatus;
    @OneToOne
    private Invoice invoice;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(final PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(final Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(final double amount) {
        this.amount = amount;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(final PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(final Invoice invoice) {
        this.invoice = invoice;
    }


}

