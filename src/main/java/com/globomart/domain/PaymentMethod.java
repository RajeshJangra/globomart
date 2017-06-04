package com.globomart.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by rajeshkumar on 03/06/17.
 */
@Entity
public class PaymentMethod {
    @Id
    private long id;
    @Column
    private String methodType;

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public String getMethodType() {
        return methodType;
    }

    public void setMethodType(final String methodType) {
        this.methodType = methodType;
    }
}
