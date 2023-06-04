package personaje;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import armaSamurai.ArmaSamurai;
import armasConvencionales.Arma;
import armasConvencionales.Papel;
import armasConvencionales.Piedra;
import armasConvencionales.Tijera;
import armasMomia.ArmaMomia;

public class Samurai extends Personaje {
protected static ArmaSamurai armaSamurai;
	
	protected static Piedra piedra;
	protected static Papel papel;
	protected static Tijera tijera;
	

	public Samurai(String nombre, int vida, ImageIcon imagen, ArrayList<Arma> armas) {
		super("Tomoe la samurai ", 500, imagen, armas);
		// TODO Auto-generated constructor stub
		
		//this.armaMomia=armaMomia;
	}
	
	public Samurai(ImageIcon imagen, ArrayList<Arma> armas) {
		super("Tomoe la samurai ", 500, imagen,armas);
		
	}
	
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
}
	
	
