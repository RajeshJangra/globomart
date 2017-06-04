package com.globomart.domain;

import java.util.Date;

/**
 * Created by rajeshkumar on 03/06/17.
 */
public class CreditCard extends PaymentMethod {
    private String nameOnCard;
    private String creditCardNo;
    private Date expiryDate;

    private Address billingAddress;

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(final String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(final String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(final Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(final Address billingAddress) {
        this.billingAddress = billingAddress;
    }
}
