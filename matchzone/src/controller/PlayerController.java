package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.event.ActionEvent;

import javafx.scene.control.TextField;

import javafx.collections.FXCollections;
import model.Player;
import model.PlayerDAO;

public class PlayerController {
    private Stage stage;
    private int teamId;

    @FXML private TableView<Player> playerTable;
    @FXML private TableColumn<Player, String> colName;
    @FXML private TableColumn<Player, String> colPosition;
    @FXML private TableColumn<Player, Integer> colShirt;

    @FXML private TextField nameField;
    @FXML private TextField positionField;
    @FXML private TextField shirtField;

    
    @FXML
    private void initialize() {
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colPosition.setCellValueFactory(new PropertyValueFactory<>("position"));
        colShirt.setCellValueFactory(new PropertyValueFactory<>("shirtNumber"));

        playerTable.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2) {
                Player selected = playerTable.getSelectionModel().getSelectedItem();
                if (selected != null) {
                    nameField.setText(selected.getName());
                    positionField.setText(selected.getPosition());
                    shirtField.setText(String.valueOf(selected.getShirtNumber()));
                }
            }
        });
    }


    public void setStage(Stage stage) {
        this.stage = stage;
    }
    
    @FXML
    private void addPlayer(ActionEvent event) {
        String name = nameField.getText();
        String position = positionField.getText();
        String shirtNumberText = shirtField.getText();

        if (name.isEmpty() || position.isEmpty() || shirtNumberText.isEmpty()) {
            System.out.println("Faltan datos.");
            return;
        }

        try {
            int shirtNumber = Integer.parseInt(shirtNumberText);
            Player newPlayer = new Player(name, position, shirtNumber, teamId);
            PlayerDAO.insertPlayer(newPlayer);
            loadPlayers(); // refrescar
            clearForm();
        } catch (NumberFormatException e) {
            System.out.println("Número de dorsal inválido.");
        }
    }

    public void setTeamId(int teamId, int leagueId) {
        this.teamId = teamId;
        this.leagueId = leagueId;
        loadPlayers();
    }
    
    private void loadPlayers() {
        playerTable.setItems(FXCollections.observableArrayList(PlayerDAO.getPlayersByTeamId(teamId)));
    }

    private int leagueId;

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    @FXML
    private void updatePlayer(ActionEvent event) {
        Player selected = playerTable.getSelectionModel().getSelectedItem();
        if (selected == null) {
            System.out.println("Ningún jugador seleccionado.");
            return;
        }

        String name = nameField.getText();
        String position = positionField.getText();
        String shirtNumberText = shirtField.getText();

        if (name.isEmpty() || position.isEmpty() || shirtNumberText.isEmpty()) {
            System.out.println("Faltan datos.");
            return;
        }

        try {
            int shirtNumber = Integer.parseInt(shirtNumberText);
            selected.setName(name);
            selected.setPosition(position);
            selected.setShirtNumber(shirtNumber);
            PlayerDAO.updatePlayer(selected);
            loadPlayers(); // refrescar
            clearForm();
        } catch (NumberFormatException e) {
            System.out.println("Número de dorsal inválido.");
        }
    }

    private void clearForm() {
        nameField.clear();
        positionField.clear();
        shirtField.clear();
    }

    @FXML
    private void goBack() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Team_View.fxml"));
            Parent root = loader.load();
            TeamController controller = loader.getController();
            controller.setStage(stage);
            controller.setLeagueId(leagueId); // ahora sí el ID correcto
            stage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void deletePlayer(ActionEvent event) {
        Player selected = playerTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            PlayerDAO.deletePlayer(selected.getPlayerId());
            loadPlayers(); // recarga después de borrar
        }
    }

}
