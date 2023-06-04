package personaje;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import armasConvencionales.Arma;
import armasConvencionales.Papel;
import armasConvencionales.Piedra;
import armasConvencionales.Tijera;
import armasMomia.ArmaMomia;
import armasVaquera.ArmaVaquera;
import personaje.Personaje;

public class Vaquero extends Personaje {

protected static ArmaVaquera armaVaquera;
	
	protected static Piedra piedra;
	protected static Papel papel;
	protected static Tijera tijera;
	

	public Vaquero(String nombre, int vida, ImageIcon imagen, ArrayList<Arma> armas) {
		super("Shakur el Vaquero", 500, imagen, armas);
		// TODO Auto-generated constructor stub
		
		//this.armaMomia=armaMomia;
	}
	
	public Vaquero(ImageIcon imagen, ArrayList<Arma> armas) {
		super("Shakur el Vaquero ", 500, imagen,armas);
		
	}
	
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	
}
