package javafx11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFX extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	private int contador = 0;

	@Override
	public void start(Stage primaryStage) {
		Button btn = new Button();
		btn.setText("Saluda");
		Label lbl = new Label();
		lbl.setText("Weshh le famille");
		
		
		btn.setOnAction(event -> {
			contador++;
			lbl.setText("Click: "+ contador);
		});
		/*
		 * btn.setOnAction(new EventHandler<ActionEvent>() {
		 *     @Override
		 *     public void handle(ActionEvent event) {
		 *         ...
		 *     }
		 * });
		 */

		GridPane root = new GridPane();
		root.add(btn,1,1);
		root.add(lbl,1,2);


		Scene scene = new Scene(root, 300, 250);

		primaryStage.setTitle("Hola món!!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}