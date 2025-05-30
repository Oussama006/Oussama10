package app;

import controller.LeagueController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

/**
 * Clase principal de la aplicación JavaFX.
 * Carga la vista de ligas y lanza la interfaz principal.
 */


public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/League_View.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("MatchZone");
            primaryStage.show();
            primaryStage.setWidth(1000);
            primaryStage.setHeight(300);


            LeagueController controller = loader.getController();
            controller.setStage(primaryStage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

