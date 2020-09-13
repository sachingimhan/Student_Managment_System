/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educo.DAO;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author User
 */
public interface CRUDDAO<E,V> extends SuperDAO{
    public boolean saveData(E entity) throws ClassNotFoundException, SQLException;
    public boolean updateData(E entity) throws ClassNotFoundException, SQLException;
    public boolean deleteData(V value) throws ClassNotFoundException, SQLException;
    public List<E> getAllData() throws ClassNotFoundException, SQLException;
}
