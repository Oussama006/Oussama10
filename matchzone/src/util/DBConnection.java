package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase utilitaria para establecer conexión con la base de datos SQLite.
 */


public class DBConnection {

    private static final String URL = "jdbc:sqlite:football.db";

    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL);
        } catch (Exception e) {
            System.out.println("Error de connexió: " + e.getMessage());
            return null;
        }
    }
}
