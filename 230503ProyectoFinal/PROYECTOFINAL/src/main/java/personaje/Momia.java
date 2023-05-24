package personaje;


import java.awt.image.BufferedImage;
import java.util.ArrayList;

import armasConvencionales.Arma;
import armasMomia.ArmaMomia;

public class Momia  extends Personaje{
	
	private ArmaMomia armaMomia;

	public Momia(String nombre, int vida, BufferedImage imagen, ArrayList<Arma> armas) {
		super("HashSetSut La Momia ", 500, imagen, armas);
		// TODO Auto-generated constructor stub
	

	
		
		this.armaMomia=armaMomia;
	}
	
	

}
