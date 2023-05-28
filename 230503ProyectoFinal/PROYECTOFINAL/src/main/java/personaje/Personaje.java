package personaje;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import armasConvencionales.Arma;

public class Personaje extends ElementoConNombre {

	static int vida;

	protected ImageIcon imagen;

	protected ArrayList<Arma> armas;

	public Personaje(String nombre, int vida, ImageIcon imagen, ArrayList<Arma> armas) {
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

	public ImageIcon getImagen() {
		return imagen;
	}

	public void setImagen(ImageIcon imagen) {
		this.imagen = imagen;
	}

	public ArrayList<Arma> getArmas() {
		return armas;
	}

	public void setArmas(ArrayList<Arma> armas) {
		this.armas = armas;
	}

	public void lanzarDecision() {

		String frase = "Has implementado esta decision";
	}

}
