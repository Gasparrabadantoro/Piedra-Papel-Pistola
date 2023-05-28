package personaje;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import armaTorera.ArmaTorera;
import armasConvencionales.Arma;

public class Torero extends Personaje {

	private ArmaTorera armaTorera;
	
	public Torero(String nombre, int vida, ImageIcon imagen, ArrayList<Arma> armas,ArmaTorera armaTorera) {
		super(nombre, vida, imagen, armas);
		
		this.armaTorera=armaTorera;
		
	}
	
	public Torero( ImageIcon imagen, ArrayList<Arma> armas) {
		super("Ramirez el Torero ", 400, imagen, armas);
		
		
		
	}
	
	

	@Override
	public void lanzarDecision() {
		// TODO Auto-generated method stub
		super.lanzarDecision();
	}
	
	

}
