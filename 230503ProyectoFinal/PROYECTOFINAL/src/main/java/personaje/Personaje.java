package personaje;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import armasConvencionales.Arma;
import armasConvencionales.Papel;
import armasConvencionales.Piedra;
import armasConvencionales.Tijera;

public class Personaje extends ElementoConNombre {

	static int vida;

	protected ImageIcon imagen;

	protected ArrayList<Arma> armas;

	private Arma armaActual;

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

	public Arma getArmaActual() {
		return armaActual;
	}

	public void setArmaActual(Arma armaActual) {
		this.armaActual = armaActual;
	}

	/* 0 Papel,1 Piedra 2 Tijeras */
	public void eleccionArma(Personaje personaje, Personaje enemigo) {

		// elección Piedra

		if (personaje.getArmaActual().getClass() == enemigo.getArmaActual().getClass()) {

			JOptionPane.showMessageDialog(null, enemigo.getNombre() + " y tu habeis empatado");

		} else if (personaje.getArmaActual().getClass() == Piedra.class
				&& (enemigo.getArmaActual().getClass() == (Tijera.class))) {
			enemigo.setVida(enemigo.getVida() - personaje.getArmas().get(1).getDaño());
			JOptionPane.showMessageDialog(null, enemigo.getNombre() + " ha recibido daño Piedril");

		} else if (personaje.getArmaActual().getClass() == Piedra.class
				&& (enemigo.getArmaActual().getClass() == (Papel.class))) {
			personaje.setVida(personaje.getVida() - enemigo.getArmas().get(0).getDaño());
			JOptionPane.showMessageDialog(null, personaje.getNombre() + " ha recibido daño Papelil");
			// elección Papel
		

		} else if (personaje.getArmaActual().getClass() == Papel.class
				&& (enemigo.getArmaActual().getClass() == (Piedra.class))) {
			enemigo.setVida(enemigo.getVida() - personaje.getArmas().get(0).getDaño());
			JOptionPane.showMessageDialog(null, enemigo.getNombre() + " ha recibido daño Papelil");

		} else if (personaje.getArmaActual().getClass() == Papel.class
				&& (enemigo.getArmaActual().getClass() == (Tijera.class))) {
			personaje.setVida(personaje.getVida() - enemigo.getArmas().get(2).getDaño());
			JOptionPane.showMessageDialog(null, personaje.getNombre() + " ha recibido daño Tijeretil");
			// elección Tijera
		} else if (personaje.getArmaActual().getClass() == Tijera.class
				&& (enemigo.getArmaActual().getClass() == (Papel.class))) {
			enemigo.setVida(enemigo.getVida() - personaje.getArmas().get(2).getDaño());
			JOptionPane.showMessageDialog(null, enemigo.getNombre() + " ha recibido daño Tijeretil");

		} else if (personaje.getArmaActual().getClass() == Tijera.class
				&& (enemigo.getArmaActual().getClass() == (Piedra.class))) {
			personaje.setVida(personaje.getVida() - enemigo.getArmas().get(2).getDaño());
			JOptionPane.showMessageDialog(null, personaje.getNombre() + " ha recibido daño Piedril");
			
		}
	}

}
