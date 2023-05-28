package armasVaquera;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

import personaje.Personaje;

public class Revolver extends ArmaVaquera {

	public Revolver(String nombre, int daño, byte usosEnCombate, ImageIcon imagen) {
		super(nombre, daño, usosEnCombate, imagen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Atacar(Personaje personaje, int daño) {
		
		daño=100;
	
		personaje.setVida(personaje.getVida()-daño);
	
	}
	
	

}
