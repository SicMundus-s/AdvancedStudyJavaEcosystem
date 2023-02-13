package com.ravenhub;

import com.ravenhub.util.ConnectionManager;
import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcRunner {
    public static void main(String[] args) throws SQLException {
        try (var connection = ConnectionManager.getConnection()) {
            System.out.println(connection.getTransactionIsolation());
        }
    }
}
