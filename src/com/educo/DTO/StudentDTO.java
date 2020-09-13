/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educo.DTO;

/**
 *
 * @author User
 */
public class StudentDTO {

    private String stdID;
    private String name;
    private String dob;
    private String address;
    private String guardian;
    private String tel;

    public StudentDTO() {
    }

    public StudentDTO(String stdID, String name, String dob, String address, String guardian, String tel) {
        this.stdID = stdID;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.guardian = guardian;
        this.tel = tel;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getStdID() {
        return stdID;
    }

    public void setStdID(String stdID) {
        this.stdID = stdID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGuardian() {
        return guardian;
    }

    public void setGuardian(String guardian) {
        this.guardian = guardian;
    }

    @Override
    public String toString() {
        return "StudentEntity{" + "stdID=" + stdID + ", name=" + name + ", dob=" + dob + ", address=" + address + ", guardian=" + guardian + ", tel=" + tel + '}';
    }

}
