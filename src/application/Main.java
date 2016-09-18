package application;
	
import adt.Bild;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			

			System.out.println("test");
			Bild rot = new Bild("file:////C:/Neuer Ordner/rot.png");
			Bild gruen = new Bild("file:////C:/Neuer Ordner/gruen.png");
			Bild blau = new Bild("file:////C:/Neuer Ordner/blau.png");
			Bild mix = new Bild("file:////C:/Neuer Ordner/mix.png");
			
			rot.errechne();
			gruen.errechne();
			blau.errechne();
			mix.errechne();
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		//test
		
		
	}
}
