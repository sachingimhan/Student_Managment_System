/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educo.DAO.custom.impl;

import com.educo.DAO.CRUDUtil;
import com.educo.DAO.custom.ClassFeeDAO;
import com.educo.Entity.ClassFeeEntity;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author User
 */
public class ClassFeeDAOImpl implements ClassFeeDAO {

    @Override
    public boolean saveData(ClassFeeEntity entity) throws ClassNotFoundException, SQLException {
        return CRUDUtil.executeUpdate("INSERT INTO classfee VALUES(?,?,?,?,?,?,?,?)",
                entity.getFeeId(),
                entity.getStdID(),
                entity.getFeeDate(),
                entity.getFeeMonth(),
                entity.getGrossAmount(),
                entity.getDiscount(),
                entity.getNetAmount(),
                entity.getPayAmount(),
                entity.getBalance()
        );
    }

    @Override
    public boolean updateData(ClassFeeEntity entity) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteData(String value) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ClassFeeEntity> getAllData() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
