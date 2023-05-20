package personaje;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import armasConvencionales.Arma;
import armasMomia.ArmaMomia;

public class HashepsutLaMomia  extends Personaje{
	
	private ArmaMomia armaMomia;

	public HashepsutLaMomia(String nombre, int vida, BufferedImage imagen, ArrayList<Arma> armas,ArmaMomia armaMomia) {
		super(nombre, vida, imagen, armas);
		
		this.armaMomia=armaMomia;
	}
	
	

}
