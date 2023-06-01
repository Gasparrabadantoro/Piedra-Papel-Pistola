package personaje;


import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import armasConvencionales.Arma;
import armasConvencionales.Papel;
import armasConvencionales.Piedra;
import armasConvencionales.Tijera;
import armasMomia.ArmaMomia;

public class Momia  extends Personaje{
	
	protected static ArmaMomia armaMomia;
	
	protected static Piedra piedra;
	protected static Papel papel;
	protected static Tijera tijera;
	

	public Momia(String nombre, int vida, ImageIcon imagen, ArrayList<Arma> armas) {
		super("HashSetSut La Momia ", 500, imagen, armas);
		// TODO Auto-generated constructor stub
		
		//this.armaMomia=armaMomia;
	}
	
	public Momia(ImageIcon imagen, ArrayList<Arma> armas) {
		super("HashSetSut La Momia ", 500, imagen,armas);
		
	}
	
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	

}
