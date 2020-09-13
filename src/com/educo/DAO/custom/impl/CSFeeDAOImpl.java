/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educo.DAO.custom.impl;

import com.educo.DAO.CRUDUtil;
import com.educo.DAO.custom.CSFeeDAO;
import com.educo.Entity.CSFeeEntity;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author User
 */
public class CSFeeDAOImpl implements CSFeeDAO {

    @Override
    public boolean saveData(CSFeeEntity entity) throws ClassNotFoundException, SQLException {
        return CRUDUtil.executeUpdate("INSERT INTO csfee VALUES(?,?,?,?)",
                entity.getFeeId(),
                entity.getCsId(),
                entity.getSubFee(),
                entity.getStatus()
        );
    }

    @Override
    public boolean updateData(CSFeeEntity entity) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteData(String value) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CSFeeEntity> getAllData() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
