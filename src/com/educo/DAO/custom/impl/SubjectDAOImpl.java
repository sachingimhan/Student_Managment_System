/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educo.DAO.custom.impl;

import com.educo.DAO.CRUDUtil;
import com.educo.DAO.custom.SubjectDAO;
import com.educo.Entity.SubjectEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class SubjectDAOImpl implements SubjectDAO {

    @Override
    public boolean saveData(SubjectEntity entity) throws ClassNotFoundException, SQLException {
        return CRUDUtil.executeUpdate("INSERT INTO subject VALUES(?,?)",
                entity.getSubID(),
                entity.getsName()
        );
    }

    @Override
    public boolean updateData(SubjectEntity entity) throws ClassNotFoundException, SQLException {
        return CRUDUtil.executeUpdate("UPDATE subject SET sname=? WHERE subID=?", entity.getsName(), entity.getSubID());
    }

    @Override
    public boolean deleteData(String value) throws ClassNotFoundException, SQLException {
        return CRUDUtil.executeUpdate("DELETE FROM subject WHERE subID=?", value);
    }

    @Override
    public List<SubjectEntity> getAllData() throws ClassNotFoundException, SQLException {
        ResultSet rs = CRUDUtil.executeQuery("SELECT * FROM subject");
        List<SubjectEntity> list = new ArrayList<>();
        while (rs.next()) {
            list.add(new SubjectEntity(rs.getString("subID"), rs.getString("sname")));
        }
        return list;
    }

}
