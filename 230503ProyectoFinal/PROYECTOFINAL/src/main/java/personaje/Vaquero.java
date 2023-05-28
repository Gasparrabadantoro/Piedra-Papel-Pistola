package personaje;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import armasConvencionales.Arma;
import armasVaquera.ArmaVaquera;
import personaje.Personaje;

public class Vaquero extends Personaje {

	private ArmaVaquera armaVaquera;

	public Vaquero(String nombre, int vida, ImageIcon imagen, ArrayList<Arma> arma, ArmaVaquera armaVaquera ) {
		super("Shakur el Vaquero", 600, imagen, arma);
		
		this.armaVaquera=armaVaquera;
		// TODO Auto-generated constructor stub
	}
	
	public Vaquero( ImageIcon imagen, ArrayList<Arma> armas) {
		super("Shakur El Vaquero ", 600, imagen, armas);
		
	}

	@Override
	public void lanzarDecision() {
		// TODO Auto-generated method stub
		super.lanzarDecision();
	}

	
}
