package armaSamurai;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

import personaje.Personaje;

public class Katana extends ArmaSamurai {

	public Katana(String nombre, int daño, byte usosEnCombate, ImageIcon imagen) {
		super(nombre, daño, usosEnCombate, imagen);
		// TODO Auto-generated constructor stub
	}

	
	public void Atacar(Personaje personaje, int daño) {
		// TODO Auto-generated method stub
		daño=250;
		
		personaje.setVida(personaje.getVida()-daño);
	}


}
