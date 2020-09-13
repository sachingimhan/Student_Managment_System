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
public class SubjectEntity {

    private String subID;
    private String sName;

    public SubjectEntity() {
    }

    public SubjectEntity(String subID, String sName) {
        this.subID = subID;
        this.sName = sName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getSubID() {
        return subID;
    }

    public void setSubID(String subID) {
        this.subID = subID;
    }

    @Override
    public String toString() {
        return "Subject{" + "subID=" + subID + ", sName=" + sName + '}';
    }

}
