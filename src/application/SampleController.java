package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SampleController implements Initializable
{
	@FXML
	private Label lblText;
	
	@FXML
	private Button btnHallo;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		
	}
	

	public void onClick(ActionEvent event)
	{
		lblText.setText("Ich bin der neue Text");
	}

}