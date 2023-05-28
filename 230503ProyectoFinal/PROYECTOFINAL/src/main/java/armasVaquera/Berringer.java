package armasVaquera;

import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.ImageIcon;

import personaje.Personaje;

public class Berringer extends ArmaVaquera {

	Random r = new Random();

	public Berringer(String nombre, int daño, byte usosEnCombate, ImageIcon imagen) {
		super(nombre, daño, usosEnCombate, imagen);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Atacar(Personaje personaje, int daño) {

		int numeroAleatorio = r.nextInt(0, 500);

		if (numeroAleatorio == 50 || numeroAleatorio == 400) {

			daño = 500;

		} else {
			daño = 0;
		}

		personaje.setVida(personaje.getVida() - daño);
	}

}
