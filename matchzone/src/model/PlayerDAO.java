package model;

import util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase DAO para acceder y gestionar los jugadores en la base de datos.
 */


public class PlayerDAO {

    public static List<Player> getAllPlayers() {
        List<Player> players = new ArrayList<>();
        String sql = "SELECT * FROM Player";

        try (Connection conn = DBConnection.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Player p = new Player();
                p.setPlayerId(rs.getInt("player_id"));
                p.setName(rs.getString("name"));
                p.setPosition(rs.getString("position"));
                p.setShirtNumber(rs.getInt("shirt_number"));
                p.setTeamId(rs.getInt("team_id"));
                players.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Error a getAllPlayers(): " + e.getMessage());
        }

        return players;
    }

    public static void insertPlayer(Player p) {
        String sql = "INSERT INTO Player(name, position, shirt_number, team_id) VALUES(?,?,?,?)";

        try (Connection conn = DBConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, p.getName());
            pstmt.setString(2, p.getPosition());
            pstmt.setInt(3, p.getShirtNumber());
            pstmt.setInt(4, p.getTeamId());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error a insertPlayer(): " + e.getMessage());
        }
    }

    public static void deletePlayer(int playerId) {
        String sql = "DELETE FROM Player WHERE player_id = ?";

        try (Connection conn = DBConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, playerId);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error a deletePlayer(): " + e.getMessage());
        }
    }

    public static void updatePlayer(Player p) {
        String sql = "UPDATE Player SET name = ?, position = ?, shirt_number = ?, team_id = ? WHERE player_id = ?";

        try (Connection conn = DBConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, p.getName());
            pstmt.setString(2, p.getPosition());
            pstmt.setInt(3, p.getShirtNumber());
            pstmt.setInt(4, p.getTeamId());
            pstmt.setInt(5, p.getPlayerId());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error a updatePlayer(): " + e.getMessage());
        }
    }
    public static List<Player> getPlayersByTeamId(int teamId) {
        List<Player> players = new ArrayList<>();
        String sql = "SELECT * FROM Player WHERE team_id = ?";

        try (Connection conn = DBConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, teamId);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Player p = new Player();
                p.setPlayerId(rs.getInt("player_id"));
                p.setName(rs.getString("name"));
                p.setPosition(rs.getString("position"));
                p.setShirtNumber(rs.getInt("shirt_number"));
                p.setTeamId(rs.getInt("team_id"));
                players.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Error a getPlayersByTeamId(): " + e.getMessage());
        }

        return players;
    }

}
