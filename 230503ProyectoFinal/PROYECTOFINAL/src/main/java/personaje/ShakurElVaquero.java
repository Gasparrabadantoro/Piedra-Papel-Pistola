package personaje;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import armasConvencionales.Arma;
import armasVaquera.ArmaVaquera;
import personaje.Personaje;

public class ShakurElVaquero extends Personaje {

	private ArmaVaquera armaVaquera;

	public ShakurElVaquero(String nombre, int vida, BufferedImage imagen, ArrayList<Arma> arma, ArmaVaquera armaVaquera ) {
		super(nombre, vida, imagen, arma);
		
		this.armaVaquera=armaVaquera;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void lanzarDecision() {
		// TODO Auto-generated method stub
		super.lanzarDecision();
	}

	
}
