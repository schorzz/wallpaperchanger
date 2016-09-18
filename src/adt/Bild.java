package adt;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

public class Bild {
	
	private Image bild;
	private Color farbmitte;
	private Integer mittelwertGesammt = 0;
	private Integer mittelwertRot = 0;
	private Integer mittelwertGruen = 0;
	private Integer mittelwertBlau = 0;
	
	public Bild(String pfad){
		
		if(pfad != ""){
			
			bild = new Image(pfad);
			
			
			
		}
		
	}
	public void errechne(){
		//Idee: über pixel mit einem pixelreader iterieren
		
		
		//der mittelwert der farben wird errechnet
		
		Integer anzahlPixel=0;
		
		int color = 0;
		int red=0;
		int green =0;
		int blue=0;
		
		int summeRot=0;
		int summeGruen =0;
		int summeBlau=0;
		
		for (int y = 0; y < bild.getHeight(); y++) {
			
			for (int x = 0; x < bild.getWidth(); x++) {
				color= bild.getPixelReader().getArgb(x, y);
				red = (color & 0x00ff0000)>>16;
				green = (color & 0x0000ff00)>>8;
				blue = (color & 0x000000ff);
				anzahlPixel++;
				
				summeRot+=red;
				summeGruen+=green;
				summeBlau+=blue;
				
			}
			
		}
		
		if(summeRot>=1){
		summeRot=(int)(summeRot/anzahlPixel);
		mittelwertRot=summeRot;
		}
		if(summeGruen>=1){
		summeGruen=(int)(summeGruen/anzahlPixel);
		mittelwertGruen=summeGruen;
		}
		if(summeBlau>=1){
		summeBlau=(int)(summeBlau/anzahlPixel);
		mittelwertBlau=summeBlau;
		}
		
		mittelwertGesammt=((mittelwertRot+1)+(mittelwertGruen+1)+(mittelwertBlau+1))/3;
		if(mittelwertGesammt>=3){
			mittelwertGesammt=(int)mittelwertGesammt-1;
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println(" rotwert: "+summeRot+"\n summeGruen: "+summeGruen+"\n summeBlau: "+summeBlau);
		System.out.println("mittelwert gesammt: "+mittelwertGesammt);
		//System.out.println("--------------------------------");
		
		
	}
	public Integer getMittelwert(){
		
		return mittelwertGesammt;
	}
	
	

}
