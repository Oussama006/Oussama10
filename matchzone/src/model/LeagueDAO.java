package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import util.DBConnection;

/**
 * Clase DAO para acceder a los datos de las ligas desde la base de datos.
 */


public class LeagueDAO {
    public static List<League> getAllLeagues() {
        List<League> leagues = new ArrayList<>();
        String sql = "SELECT * FROM League";

        try (Connection conn = DBConnection.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                leagues.add(new League(rs.getInt("league_id"), rs.getString("name")));
            }

        } catch (SQLException e) {
            System.out.println("Error en getAllLeagues(): " + e.getMessage());
        }

        return leagues;
    }
}
