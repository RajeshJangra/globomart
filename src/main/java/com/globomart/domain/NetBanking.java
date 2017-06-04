package com.globomart.domain;

/**
 * Created by rajeshkumar on 03/06/17.
 */
public class NetBanking extends PaymentMethod {
    private String loginId;
    private String accountNumber;
    private String bankName;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(final String loginId) {
        this.loginId = loginId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(final String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(final String bankName) {
        this.bankName = bankName;
    }
}