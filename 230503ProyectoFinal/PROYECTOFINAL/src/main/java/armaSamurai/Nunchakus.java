package armaSamurai;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

import personaje.Personaje;

public class Nunchakus extends ArmaSamurai{

	public Nunchakus(String nombre, int daño, byte usosEnCombate, ImageIcon imagen) {
		super(nombre, daño, usosEnCombate, imagen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Atacar(Personaje personaje, int daño) {
		// TODO Auto-generated method stub
		daño=240;
		
		personaje.setVida(personaje.getVida()-daño);
		
		
	}

	
}
