package armasVaquera;

import java.awt.image.BufferedImage;
import java.util.Random;

import personaje.Personaje;

public class Carabina extends ArmaVaquera {
	
	Random r=new Random();

	public Carabina(String nombre, int daño, byte usosEnCombate, BufferedImage imagen) {
		super(nombre, daño, usosEnCombate, imagen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Atacar(Personaje personaje, int daño) {
		
		int numeroAleatorio=r.nextInt(0,100);
		
		numeroAleatorio=daño;
		
		personaje.setVida(personaje.getVida()-daño);
		
	}
	
	

}
