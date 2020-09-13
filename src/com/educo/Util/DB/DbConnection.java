/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educo.Util.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author User
 */
public class DbConnection {

    private static DbConnection dbConnection;
    private final Connection connection;
    private final String url="jdbc:mysql://localhost:3306/StudentManagmentSystem";
    private final String user="root";
    private final String password="";

    private DbConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.mariadb.jdbc.Driver");
       connection=DriverManager.getConnection(url, user, password);
    }

    public static DbConnection getInstance() throws ClassNotFoundException, SQLException {
        if (dbConnection == null) {
            dbConnection = new DbConnection();
        }
        return dbConnection;
    }

    public Connection getConnection() {
        return connection;
    }
}
