/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educo.DAO;

import com.educo.Util.DB.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class CRUDUtil {

    private static PreparedStatement make(String sql, Object... arg) throws ClassNotFoundException, SQLException {
        PreparedStatement pstm = DbConnection.getInstance().getConnection().prepareStatement(sql);
        for (int i = 0; i < arg.length; i++) {
            pstm.setObject((i + 1), arg[i]);
        }
        return pstm;
    }

    public static boolean executeUpdate(String sql, Object... arg) throws ClassNotFoundException, SQLException {
        return make(sql, arg).executeUpdate() > 0;
    }

    public static ResultSet executeQuery(String sql, Object... arg) throws ClassNotFoundException, SQLException {
        return make(sql, arg).executeQuery();
    }
}
