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
public class ClassSubjectEntity {

    private int csId;
    private String roomID;
    private String subID;
    private double subFee;

    public ClassSubjectEntity() {
    }

    public ClassSubjectEntity(int csId, String roomID, String subID, double subFee) {
        this.csId = csId;
        this.roomID = roomID;
        this.subID = subID;
        this.subFee = subFee;
    }

    public double getSubFee() {
        return subFee;
    }

    public void setSubFee(double subFee) {
        this.subFee = subFee;
    }

    public int getCsId() {
        return csId;
    }

    public void setCsId(int csId) {
        this.csId = csId;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getSubID() {
        return subID;
    }

    public void setSubID(String subID) {
        this.subID = subID;
    }

    @Override
    public String toString() {
        return "ClassSubjectEntity{" + "csId=" + csId + ", roomID=" + roomID + ", subID=" + subID + ", subFee=" + subFee + '}';
    }
    
}
