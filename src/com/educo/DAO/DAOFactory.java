/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educo.DAO;

import com.educo.DAO.custom.impl.CSFeeDAOImpl;
import com.educo.DAO.custom.impl.ClassFeeDAOImpl;
import com.educo.DAO.custom.impl.ClassRoomDAOImpl;
import com.educo.DAO.custom.impl.ClassSubjectDAOImpl;
import com.educo.DAO.custom.impl.StudentDAOImpl;
import com.educo.DAO.custom.impl.SubjectDAOImpl;
import com.educo.DAO.custom.impl.TeacherDAOImpl;

/**
 *
 * @author User
 */
public class DAOFactory {

    public enum DAOType {
        CS_FEE,
        CLASS_FEE,
        CLASS_ROOM,
        CLASS_SUBJECT,
        STUDENT,
        SUBJECT,
        TEACHER
    }

    public static SuperDAO makeDAO(DAOType type) {
        switch (type) {
            case CS_FEE:
                return new CSFeeDAOImpl();
            case CLASS_FEE:
                return new ClassFeeDAOImpl();
            case CLASS_ROOM:
                return new ClassRoomDAOImpl();
            case CLASS_SUBJECT:
                return new ClassSubjectDAOImpl();
            case STUDENT:
                return new StudentDAOImpl();
            case SUBJECT:
                return new SubjectDAOImpl();
            case TEACHER:
                return new TeacherDAOImpl();
            default:
                return null;
        }
    }
}
