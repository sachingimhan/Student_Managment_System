/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educo.BO.custom.impl;

import com.educo.BO.custom.RegistrationBO;
import com.educo.DAO.DAOFactory;
import com.educo.DAO.DAOFactory.DAOType;
import com.educo.DAO.custom.StudentDAO;
import com.educo.DTO.StudentDTO;
import com.educo.Entity.StudentEntity;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class RegistrationBOImpl implements RegistrationBO {

    StudentDAO studentDao = (StudentDAO) DAOFactory.makeDAO(DAOType.STUDENT);

    @Override
    public boolean saveStudent(StudentDTO dto) throws ClassNotFoundException, SQLException {
        return studentDao.saveData(new StudentEntity(dto.getStdID(), dto.getName(), dto.getDob(), dto.getAddress(), dto.getGuardian(), dto.getTel()));
    }

    @Override
    public List<StudentDTO> getAllStudents() throws ClassNotFoundException, SQLException {
        List<StudentEntity> allData = studentDao.getAllData();
        List<StudentDTO> list = new ArrayList<>();
        for (StudentEntity obj : allData) {
            list.add(new StudentDTO(obj.getStdID(), obj.getName(), obj.getDob(), obj.getAddress(), obj.getGuardian(), obj.getTel()));
        }
        return list;
    }

}
