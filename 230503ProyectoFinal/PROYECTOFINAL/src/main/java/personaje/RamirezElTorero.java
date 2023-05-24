package personaje;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import armaTorera.ArmaTorera;
import armasConvencionales.Arma;

public class RamirezElTorero extends Personaje {

	private ArmaTorera armaTorera;
	
	public RamirezElTorero(String nombre, int vida, ImageIcon imagen, ArrayList<Arma> armas,ArmaTorera armaTorera) {
		super(nombre, vida, imagen, armas);
		
		this.armaTorera=armaTorera;
		
	}

	@Override
	public void lanzarDecision() {
		// TODO Auto-generated method stub
		super.lanzarDecision();
	}
	
	

}
