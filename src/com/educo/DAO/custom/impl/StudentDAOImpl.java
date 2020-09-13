/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educo.DAO.custom.impl;

import com.educo.DAO.CRUDUtil;
import com.educo.DAO.custom.StudentDAO;
import com.educo.Entity.StudentEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class StudentDAOImpl implements StudentDAO {

    @Override //Save Student table Data
    public boolean saveData(StudentEntity entity) throws ClassNotFoundException, SQLException {
        return CRUDUtil.executeUpdate("INSERT INTO student VALUES(?,?,?,?,?,?)",
                entity.getStdID(),
                entity.getName(),
                entity.getDob(),
                entity.getAddress(),
                entity.getGuardian(),
                entity.getTel()
        );
    }

    @Override //update Student table Data
    public boolean updateData(StudentEntity entity) throws ClassNotFoundException, SQLException {
        return CRUDUtil.executeUpdate("UPDATE TABLE student SET name=?,dob=?,address=?,guardian=?,tel1=? WHERE stdID=?",
                entity.getName(),
                entity.getDob(),
                entity.getAddress(),
                entity.getGuardian(),
                entity.getTel(),
                entity.getStdID()
        );
    }

    @Override //Delete student table Data
    public boolean deleteData(String value) throws ClassNotFoundException, SQLException {
        return CRUDUtil.executeUpdate("DELETE FROM student WHERE stdID=?", value);
    }

    @Override //Get All Student Data
    public List<StudentEntity> getAllData() throws ClassNotFoundException, SQLException {
        ResultSet rs = CRUDUtil.executeQuery("SELECT * FROM student");
        List<StudentEntity> list = new ArrayList<>();
        while (rs.next()) {
            list.add(new StudentEntity(
                    rs.getString("stdID"),
                    rs.getString("name"),
                    rs.getString("dob"),
                    rs.getString("address"),
                    rs.getString("guardian"),
                    rs.getString("tel1"))
            );
        }

        return list;
    }

}
