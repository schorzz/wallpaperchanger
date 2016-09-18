package adt;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class Bild {
	
	private Image bild;
	private Color farbmitte;
	private Integer mittelwert = 0;
	
	public Bild(String pfad){
		
		if(pfad != ""){
			
			bild = new Image(pfad);
			
			
		}
		
	}
	public void errechne(){
		
	}
	public Integer getMittelwert(){
		
		return mittelwert;
	}
	
	

}
