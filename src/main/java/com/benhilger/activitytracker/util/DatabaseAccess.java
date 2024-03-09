package com.benhilger.activitytracker.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DatabaseAccess {

    @Value("${SQL_DB_CONNECTION_STRING}")
    private static String dbConnectionString;

    /**
     * Uses the configured environment variable to connect to the database
     *
     * @return Connection
     * @throws SQLException if the database is unable to get connected to
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbConnectionString);
    }
}
