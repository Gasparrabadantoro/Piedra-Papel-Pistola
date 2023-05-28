package armasConvencionales;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

import personaje.ElementoConNombre;
import personaje.Personaje;

public class Arma extends ElementoConNombre  {
	
	protected int daño;
	
	protected byte usosEnCombate;
	
	protected  ImageIcon imagen;
	protected Piedra piedra;
	protected Papel papel;
	protected Tijera tijera;
	
	
	

	public Arma(String nombre, int daño, byte usosEnCombate,  ImageIcon imagen,Piedra piedra,Papel papel,Tijera tijera) {
		super(nombre);
		this.daño = daño;
		this.usosEnCombate = usosEnCombate;
		this.imagen = imagen;
	}
	
	public Arma(String nombre, int daño, byte usosEnCombate, ImageIcon imagen) {
		super(nombre);
		this.daño = daño;
		this.usosEnCombate = usosEnCombate;
		this.imagen = imagen;
	}


	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}

	public byte getUsosEnCombate() {
		return usosEnCombate;
	}

	public void setUsosEnCombate(byte usosEnCombate) {
		this.usosEnCombate = usosEnCombate;
	}

	public ImageIcon getImagen() {
		return imagen;
	}

	public void setImagen(ImageIcon imagen) {
		this.imagen = imagen;
	}

	
	public void Atacar(Personaje personaje,int daño) {
		
		personaje.setVida(personaje.getVida()-daño);
		
		
	}
	
	
	

}
