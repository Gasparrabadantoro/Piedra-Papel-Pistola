package armasVaquera;

import java.awt.image.BufferedImage;


import javax.swing.ImageIcon;

import armasConvencionales.Arma;
import personaje.Personaje;

public class Revolver extends Arma {

	public Revolver(String nombre, int daño, byte usosEnCombate, ImageIcon imagen) {
		super("Revolver", daño, usosEnCombate, new ImageIcon(".\\images\\revolver.png"));
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Atacar(Personaje personaje, int daño) {
		
		daño=500;
	
		personaje.setVida(personaje.getVida()-daño);
	
	}
	
	

}
