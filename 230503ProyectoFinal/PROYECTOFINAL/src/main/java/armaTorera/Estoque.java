package armaTorera;

import javax.swing.ImageIcon;

import armasConvencionales.Arma;
import personaje.Personaje;

public class Estoque extends Arma {

	public Estoque(String nombre, int daño, byte usosEnCombate, ImageIcon imagen) {
		super("Estoque", daño, usosEnCombate, new ImageIcon(".\\images\\estoque.png"));
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Atacar(Personaje personaje, int daño) {
		
		daño=400;
	
		personaje.setVida(personaje.getVida()-daño);
	
	}
	
	

}
