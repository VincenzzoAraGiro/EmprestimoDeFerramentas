package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    private static final String URL = "jdbc:sqlite:tools_management.db";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}