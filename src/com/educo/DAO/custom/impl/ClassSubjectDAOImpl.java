/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educo.DAO.custom.impl;

import com.educo.DAO.CRUDUtil;
import com.educo.DAO.custom.ClassSubjectDAO;
import com.educo.Entity.ClassSubjectEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ClassSubjectDAOImpl implements ClassSubjectDAO {

    @Override
    public boolean saveData(ClassSubjectEntity entity) throws ClassNotFoundException, SQLException {
        return CRUDUtil.executeUpdate("INSERT INTO classsubject VALUES(?,?,?,?)",
                entity.getCsId(),
                entity.getRoomID(),
                entity.getSubID(),
                entity.getSubFee()
        );
    }

    @Override
    public boolean updateData(ClassSubjectEntity entity) throws ClassNotFoundException, SQLException {
        return CRUDUtil.executeUpdate("UPDATE classsubject SET roomID=?, subID=?,subFee=? WHERE csId=?",
                entity.getRoomID(),
                entity.getSubID(),
                entity.getSubFee(),
                entity.getCsId()
        );
    }

    @Override
    public boolean deleteData(Integer value) throws ClassNotFoundException, SQLException {
        return CRUDUtil.executeUpdate("DELETE FROM classsubject WHERE csId=?", value);
    }

    @Override
    public List<ClassSubjectEntity> getAllData() throws ClassNotFoundException, SQLException {
        ResultSet rs = CRUDUtil.executeQuery("SELECT * FROM classsubject");
        List<ClassSubjectEntity> list = new ArrayList<>();
        while (rs.next()) {
            list.add(new ClassSubjectEntity(rs.getInt("csId"), rs.getString("roomID"), rs.getString("subID"), rs.getDouble("subFee")));
        }
        return list;
    }

}
