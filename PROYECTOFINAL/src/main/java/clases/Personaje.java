package clases;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Personaje extends ElementoConNombre{
	
	static  int vida;
	
	private  BufferedImage imagen;
	
	private ArrayList<Arma>armas;

	public Personaje(String nombre, int vida, BufferedImage imagen, ArrayList<Arma> armas) {
		super(nombre);
		this.vida = vida;
		this.imagen = imagen;
		this.armas = armas;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public BufferedImage getImagen() {
		return imagen;
	}

	public void setImagen(BufferedImage imagen) {
		this.imagen = imagen;
	}

	public ArrayList<Arma> getArmas() {
		return armas;
	}

	public void setArmas(ArrayList<Arma> armas) {
		this.armas = armas;
	}

	public static void atacar(int ataque) {
		
		ataque-=vida;
	}
	

}
