package org.aprendendojavafx.crud;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
	
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		URL fxml = getClass().getResource("./contas.fxml");
		Parent parent = FXMLLoader.load(fxml);
		stage.setScene(new Scene(parent));
		stage.show();
	}

}
