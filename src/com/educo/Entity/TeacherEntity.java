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
public class TeacherEntity {

    private String tecID;
    private String subID;
    private String tecName;
    private String tecAddress;
    private String tecContact;

    public TeacherEntity() {
    }

    public TeacherEntity(String tecID, String subID, String tecName, String tecAddress, String tecContact) {
        this.tecID = tecID;
        this.subID = subID;
        this.tecName = tecName;
        this.tecAddress = tecAddress;
        this.tecContact = tecContact;
    }

    public String getTecContact() {
        return tecContact;
    }

    public void setTecContact(String tecContact) {
        this.tecContact = tecContact;
    }

    public String getTecID() {
        return tecID;
    }

    public void setTecID(String tecID) {
        this.tecID = tecID;
    }

    public String getSubID() {
        return subID;
    }

    public void setSubID(String subID) {
        this.subID = subID;
    }

    public String getTecName() {
        return tecName;
    }

    public void setTecName(String tecName) {
        this.tecName = tecName;
    }

    public String getTecAddress() {
        return tecAddress;
    }

    public void setTecAddress(String tecAddress) {
        this.tecAddress = tecAddress;
    }

    @Override
    public String toString() {
        return "TeacherEntity{" + "tecID=" + tecID + ", subID=" + subID + ", tecName=" + tecName + ", tecAddress=" + tecAddress + ", tecContact=" + tecContact + '}';
    }

}
