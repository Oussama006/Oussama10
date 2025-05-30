package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.collections.FXCollections;
import model.Team;
import model.TeamDAO;

public class TeamController {
    private Stage stage;
    private int leagueId;

    @FXML private ListView<Team> teamList;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
        loadTeams();
    }

    @FXML
    private void initialize() {
        // Esto puede estar vacío, solo para asegurar que el controlador esté listo antes de llamar setLeagueId
    }

    
    private void loadTeams() {
        teamList.setItems(FXCollections.observableArrayList(TeamDAO.getTeamsByLeagueId(leagueId)));

        teamList.setOnMouseClicked((MouseEvent event) -> {
            if (event.getClickCount() == 2) {
                Team selected = teamList.getSelectionModel().getSelectedItem();
                if (selected != null) {
                    System.out.println("Equip seleccionat: " + selected.getName());
                    openPlayerView(selected.getTeamId());
                } else {
                    System.out.println("Cap equip seleccionat.");
                }
            }
        });
    }


    private void openPlayerView(int teamId) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Player_View.fxml"));
            Parent root = loader.load();

            PlayerController controller = loader.getController();
            controller.setStage(stage);
            controller.setTeamId(teamId, leagueId);  // <-- ahora pasamos también el leagueId

            stage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    private void goBack() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/League_View.fxml"));
            Parent root = loader.load();
            LeagueController controller = loader.getController();
            controller.setStage(stage);
            stage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
