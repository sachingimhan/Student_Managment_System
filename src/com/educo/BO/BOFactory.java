/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educo.BO;

import com.educo.BO.custom.impl.RegistrationBOImpl;

/**
 *
 * @author User
 */
public class BOFactory {

    public enum BOType {
        STUDENT_REG
    }

    public static SuperBO makeBO(BOType type) {
        switch (type) {
            case STUDENT_REG:
                return new RegistrationBOImpl();
            default:
                return null;
        }
    }
}
