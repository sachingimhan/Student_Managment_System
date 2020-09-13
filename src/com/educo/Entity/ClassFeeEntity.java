/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educo.Entity;

/**
 *
 * @author User
 */
public class ClassFeeEntity {

    private String feeId;
    private String stdID;
    private String feeDate;
    private String feeMonth;
    private double grossAmount;
    private double discount;
    private double netAmount;
    private double payAmount;
    private double balance;

    public ClassFeeEntity() {
    }

    public ClassFeeEntity(String feeId, String stdID, String feeDate, String feeMonth, double grossAmount, double discount, double netAmount, double payAmount, double balance) {
        this.feeId = feeId;
        this.stdID = stdID;
        this.feeDate = feeDate;
        this.feeMonth = feeMonth;
        this.grossAmount = grossAmount;
        this.discount = discount;
        this.netAmount = netAmount;
        this.payAmount = payAmount;
        this.balance = balance;
    }

    public String getFeeMonth() {
        return feeMonth;
    }

    public void setFeeMonth(String feeMonth) {
        this.feeMonth = feeMonth;
    }

    public String getFeeId() {
        return feeId;
    }

    public void setFeeId(String feeId) {
        this.feeId = feeId;
    }

    public String getStdID() {
        return stdID;
    }

    public void setStdID(String stdID) {
        this.stdID = stdID;
    }

    public String getFeeDate() {
        return feeDate;
    }

    public void setFeeDate(String feeDate) {
        this.feeDate = feeDate;
    }

    public double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
    }

    public double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(double payAmount) {
        this.payAmount = payAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "ClassFeeEntity{" + "feeId=" + feeId + ", stdID=" + stdID + ", feeDate=" + feeDate + ", feeMonth=" + feeMonth + ", grossAmount=" + grossAmount + ", discount=" + discount + ", netAmount=" + netAmount + ", payAmount=" + payAmount + ", balance=" + balance + '}';
    }
    
}
