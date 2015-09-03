package com.dewlad;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController implements Initializable{
	 @FXML
	    private Button button;
	 @FXML
	 	private TextField textfield;
	 @FXML
	    private ImageView img_view;
	
	 	/* Onclick button */
	    @FXML
	    public void onClickMethod(){
	        Integer a = Integer.parseInt(textfield.getText()); 
	        a+=1;
	        if(a==10)
	        	button.setStyle("-fx-background-color: red;");
	        textfield.setText(a.toString()); 
	    }
	    /* Image download */
		@Override
	    public void initialize(URL location, ResourceBundle resources) {
	        File file = new File("src/main/resources/images/imd_downl.png");
	        Image image = new Image(file.toURI().toString());
	        img_view.setImage(image);
	    }
		
}
