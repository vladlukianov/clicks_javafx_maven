package com.dewlad;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			String fxmlFile = "view.fxml";
	        FXMLLoader loader = new FXMLLoader();
	        Parent root = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));
	        primaryStage.setTitle("Clicks");
	        primaryStage.setScene(new Scene(root));
	        primaryStage.show();
	       
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
