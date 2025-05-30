package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.collections.FXCollections;
import model.League;
import model.LeagueDAO;

/**
 * Controlador para la vista de ligas.
 * Muestra una lista de ligas y abre la vista de equipos al hacer doble clic.
 */


public class LeagueController {
    private Stage stage;

    @FXML
    private ListView<League> leagueList;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private void initialize() {
        leagueList.setItems(FXCollections.observableArrayList(LeagueDAO.getAllLeagues()));
        leagueList.setOnMouseClicked((MouseEvent event) -> {
            if (event.getClickCount() == 2) {
                League selected = leagueList.getSelectionModel().getSelectedItem();
                if (selected != null) {
                    openTeamView(selected.getLeagueId());
                }
            }
        });
    }

    private void openTeamView(int leagueId) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Team_View.fxml"));
            Parent root = loader.load();
            TeamController controller = loader.getController();
            controller.setStage(stage);
            controller.setLeagueId(leagueId);
            stage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

