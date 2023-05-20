package clases;

import java.awt.image.BufferedImage;

public class Arma extends ElementoConNombre  {
	
	private int daño;
	
	private byte usosEnCombate;
	
	private BufferedImage imagen;

	public Arma(String nombre, int daño, byte usosEnCombate, BufferedImage imagen) {
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

	public BufferedImage getImagen() {
		return imagen;
	}

	public void setImagen(BufferedImage imagen) {
		this.imagen = imagen;
	}

	
	
	
	
	// falta el metodo atacar()

}
