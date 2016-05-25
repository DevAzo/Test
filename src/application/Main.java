package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) 
	{
		try 
		{
			// Das ist der Controller der View
			// Wie die View aussieht, steht als XML-Datei in der Datei Sample.fxml
			Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
			
			// Das ist die View
			Scene scene = new Scene(root);
			
			// Das ist das Style Sheet f�r die View
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			// Das Main mit der ersten View verbinden.
			primaryStage.setScene(scene);
			
			// Erste View anzeigen, ab hier geht es los.
			primaryStage.show();
		} 
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
