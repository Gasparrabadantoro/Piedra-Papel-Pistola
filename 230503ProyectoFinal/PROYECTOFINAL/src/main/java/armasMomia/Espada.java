package armasMomia;

import java.awt.image.BufferedImage;

import personaje.Personaje;

public class Espada extends ArmaMomia {

	public Espada(String nombre, int daño, byte usosEnCombate, BufferedImage imagen) {
		super(nombre, daño, usosEnCombate, imagen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Atacar(Personaje personaje, int daño) {
		
		daño=125;
		
		personaje.setVida(personaje.getVida()-daño);
	}
	
	

}
