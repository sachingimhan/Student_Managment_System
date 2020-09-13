/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educo.DAO.custom.impl;

import com.educo.DAO.CRUDUtil;
import com.educo.DAO.custom.TeacherDAO;
import com.educo.Entity.TeacherEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class TeacherDAOImpl implements TeacherDAO {

    @Override
    public boolean saveData(TeacherEntity entity) throws ClassNotFoundException, SQLException {
        return CRUDUtil.executeUpdate("INSERT INTO teacher VALUES(?,?,?,?,?)",
                entity.getTecID(),
                entity.getSubID(),
                entity.getTecName(),
                entity.getTecAddress(),
                entity.getTecContact()
        );
    }

    @Override
    public boolean updateData(TeacherEntity entity) throws ClassNotFoundException, SQLException {
        return CRUDUtil.executeUpdate("UPDATE teacher SET subID=?,tecName=?,tecAddress=?,tecContact=? WHERE tecID=?",
                entity.getSubID(),
                entity.getTecName(),
                entity.getTecAddress(),
                entity.getTecContact(),
                entity.getTecID()
        );
    }

    @Override
    public boolean deleteData(String value) throws ClassNotFoundException, SQLException {
        return CRUDUtil.executeUpdate("DELETE FROM teacher WHERE tecID=?", value);
    }

    @Override
    public List<TeacherEntity> getAllData() throws ClassNotFoundException, SQLException {
        ResultSet rs = CRUDUtil.executeQuery("SELECT * FROM teacher");
        List<TeacherEntity> list = new ArrayList<>();
        while (rs.next()) {
            list.add(new TeacherEntity(
                    rs.getString("tecID"),
                    rs.getString("subID"),
                    rs.getString("tecName"),
                    rs.getString("tecAddress"),
                    rs.getString("tecContact")
            ));
        }
        return list;
    }

}
