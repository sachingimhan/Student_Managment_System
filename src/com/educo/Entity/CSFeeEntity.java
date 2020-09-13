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
public class CSFeeEntity {

    private String feeId;
    private int csId;
    private double subFee;
    private String status;

    public CSFeeEntity() {
    }

    public CSFeeEntity(String feeId, int csId, double subFee, String status) {
        this.feeId = feeId;
        this.csId = csId;
        this.subFee = subFee;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFeeId() {
        return feeId;
    }

    public void setFeeId(String feeId) {
        this.feeId = feeId;
    }

    public int getCsId() {
        return csId;
    }

    public void setCsId(int csId) {
        this.csId = csId;
    }

    public double getSubFee() {
        return subFee;
    }

    public void setSubFee(double subFee) {
        this.subFee = subFee;
    }

    @Override
    public String toString() {
        return "CSFeeEntity{" + "feeId=" + feeId + ", csId=" + csId + ", subFee=" + subFee + ", status=" + status + '}';
    }
    
}
