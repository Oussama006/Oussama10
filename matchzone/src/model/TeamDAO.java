package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import util.DBConnection;

public class TeamDAO {

    public static List<Team> getTeamsByLeagueId(int leagueId) {
        List<Team> teams = new ArrayList<>();
        String sql = "SELECT * FROM Team WHERE league_id = ?";

        try (Connection conn = DBConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, leagueId);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                teams.add(new Team(rs.getInt("team_id"), rs.getString("name")));
            }

        } catch (SQLException e) {
            System.out.println("Error en getTeamsByLeagueId(): " + e.getMessage());
        }

        return teams;
    }
}
