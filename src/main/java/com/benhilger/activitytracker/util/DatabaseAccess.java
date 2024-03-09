package com.benhilger.activitytracker.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseAccess {

    /**
     * Uses the configured environment variable to connect to the database
     *
     * @return Connection
     * @throws SQLException if the database is unable to get connected to
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("");
    }
}
