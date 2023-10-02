package org.example;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
public class DBConnection {
    private static DBConnection instance;
    private Connection connection;
    private static final String DB_URL = "jdbc:sqlite:SQLite/sqlite-tools-win32-x86-3430100/patrones.db";

    public Connection getConnection(){
        return connection;
    }
    private DBConnection(){
        try {
            connection = DriverManager.getConnection(DB_URL);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }
    public static synchronized DBConnection getInstance(){
        if(instance == null){
            instance = new DBConnection();
            return instance;
        }
        return instance;
    }
}
