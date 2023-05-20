package armasMomia;

import java.awt.image.BufferedImage;

import personaje.Personaje;

public class Escudo extends ArmaMomia {

	public Escudo(String nombre, int daño, byte usosEnCombate, BufferedImage imagen) {
		super(nombre, daño, usosEnCombate, imagen);
	
		
	}
	
	public void defender(Personaje personaje,int daño) {
		
		
		
		personaje.setVida(personaje.getVida()+daño);
		
	}
	

}
