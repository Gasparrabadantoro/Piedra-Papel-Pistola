package armasMomia;

import java.awt.image.BufferedImage;

import personaje.Personaje;

public class Hoz extends ArmaMomia{

	public Hoz(String nombre, int daño, byte usosEnCombate, BufferedImage imagen) {
		super(nombre, daño, usosEnCombate, imagen);
		
		
	}

	@Override
	public void Atacar(Personaje personaje, int daño) {
		
		daño=400;
		
		personaje.setVida(personaje.getVida()-daño);
	}
	
	

}
