/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educo.DAO.custom.impl;

import com.educo.DAO.CRUDUtil;
import com.educo.DAO.custom.ClassRoomDAO;
import com.educo.Entity.ClassRoomEntity;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ClassRoomDAOImpl implements ClassRoomDAO {

    @Override
    public boolean saveData(ClassRoomEntity entity) throws ClassNotFoundException, SQLException {
        return CRUDUtil.executeUpdate("INSER INTO classroom VALUES(?,?)",
                entity.getRoomId(),
                entity.getRoomName()
        );
    }

    @Override
    public boolean updateData(ClassRoomEntity entity) throws ClassNotFoundException, SQLException {
        return CRUDUtil.executeUpdate("UPDATE classroom SET roomName=? WHERE roomID=?",
                entity.getRoomName(),
                entity.getRoomId()
        );
    }

    @Override
    public boolean deleteData(String value) throws ClassNotFoundException, SQLException {
        return CRUDUtil.executeUpdate("DELETE FROM classroom WHERE roomID=?", value);
    }

    @Override
    public List<ClassRoomEntity> getAllData() throws ClassNotFoundException, SQLException {
        ResultSet rs = CRUDUtil.executeQuery("SELECT * FROM classroom");
        List<ClassRoomEntity> list = new ArrayList<>();
        while (rs.next()) {
            list.add(new ClassRoomEntity(rs.getString("roomID"), rs.getString("roomName")));
        }
        return list;
    }

}
