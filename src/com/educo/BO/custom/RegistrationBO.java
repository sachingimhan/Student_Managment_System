/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educo.BO.custom;

import com.educo.BO.SuperBO;
import com.educo.DTO.StudentDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author User
 */
public interface RegistrationBO extends SuperBO {

    public boolean saveStudent(StudentDTO dto) throws ClassNotFoundException, SQLException;

    public List<StudentDTO> getAllStudents() throws ClassNotFoundException, SQLException;
}
