package app;

import controller.LeagueController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

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
            primaryStage.setWidth(1000);  // o el ancho deseado
            primaryStage.setHeight(300); // o la altura deseada


            LeagueController controller = loader.getController();
            controller.setStage(primaryStage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

