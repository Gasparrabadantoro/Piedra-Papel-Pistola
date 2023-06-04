package personaje;


import java.util.ArrayList;

import javax.swing.ImageIcon;

import armaTorera.ArmaTorera;
import armasConvencionales.Arma;
import armasConvencionales.Papel;
import armasConvencionales.Piedra;
import armasConvencionales.Tijera;
import armasMomia.ArmaMomia;

public class Torero extends Personaje {

protected static ArmaTorera armaTorera;
	
	protected static Piedra piedra;
	protected static Papel papel;
	protected static Tijera tijera;
	

	public Torero(String nombre, int vida, ImageIcon imagen, ArrayList<Arma> armas) {
		super("Ramírez el Torero ", 400, imagen, armas);
		// TODO Auto-generated constructor stub
		
		//this.armaMomia=armaMomia;
	}
	
	public Torero(ImageIcon imagen, ArrayList<Arma> armas) {
		super("Ramírez el Torero", 400, imagen,armas);
		
	}
	
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	
	

	

}
