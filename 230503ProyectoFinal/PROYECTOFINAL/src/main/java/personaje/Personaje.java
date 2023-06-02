package personaje;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import armaSamurai.Katana;
import armaTorera.Estoque;
import armasConvencionales.Arma;
import armasConvencionales.Papel;
import armasConvencionales.Piedra;
import armasConvencionales.Tijera;
import armasMomia.Escudo;
import armasVaquera.Revolver;

public class Personaje extends ElementoConNombre {

	protected int vida;

	protected ImageIcon imagen;

	protected ArrayList<Arma> armas;

	private Arma armaActual;

	public Personaje(String nombre, int vida, ImageIcon imagen, ArrayList<Arma> armas) {
		super(nombre);
		this.vida = vida;
		this.imagen = imagen;
		this.armas = armas;
	}

	public Personaje() {

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
			personaje.setVida(personaje.getVida() - enemigo.getArmas().get(1).getDaño());
			JOptionPane.showMessageDialog(null, personaje.getNombre() + " ha recibido daño Piedril");

		}
	}

	public void armaEspecial(Personaje personaje, Personaje enemigo) {
//Momia arma
		if (personaje.getClass() == Momia.class) {

			Escudo escudo = (Escudo) personaje.getArmas().get(3);
			personaje.setArmaActual(escudo);
			if (enemigo.getArmaActual().getClass() == (Piedra.class)
					|| enemigo.getArmaActual().getClass() == (Papel.class)
					|| enemigo.getArmaActual().getClass() == (Tijera.class)) {

				escudo.defender(personaje, 0);
			}

			JOptionPane.showMessageDialog(null, personaje.getNombre() + " se ha defendido y no ha recibido daño");
			//Vaquero arma
		} else if (personaje.getClass() == Vaquero.class) {

			Revolver revolver = (Revolver) personaje.getArmas().get(4);
			personaje.setArmaActual(revolver);

			if (enemigo.getArmaActual().getClass() == (Piedra.class)
					|| enemigo.getArmaActual().getClass() == (Papel.class)
					|| enemigo.getArmaActual().getClass() == (Tijera.class)) {

				revolver.Atacar(enemigo, 500);

				JOptionPane.showMessageDialog(null,
						enemigo.getNombre() + " Ha recibido un disparo de Revolver y ha sufrido 500 de daño ");
			}
			//Samurai arma
		} else if (personaje.getClass() == Samurai.class) {

			Katana katana = (Katana) personaje.getArmas().get(5);
			personaje.setArmaActual(katana);

			if (enemigo.getArmaActual().getClass() == (Piedra.class)
					|| enemigo.getArmaActual().getClass() == (Papel.class)
					|| enemigo.getArmaActual().getClass() == (Tijera.class)) {

				katana.Atacar(enemigo, 0);

				JOptionPane.showMessageDialog(null,
						enemigo.getNombre() + " Ha recibido un corte de Katana y ha sufrido 250 de daño  ");

			}
			//Torero arma
		} else if (personaje.getClass() == Torero.class){

			Estoque estoque = (Estoque) personaje.getArmas().get(6);
			personaje.setArmaActual(estoque);

			if (enemigo.getArmaActual().getClass() == (Piedra.class)
					|| enemigo.getArmaActual().getClass() == (Papel.class)
					|| enemigo.getArmaActual().getClass() == (Tijera.class)) {

				estoque.Atacar(enemigo, 0);

				JOptionPane.showMessageDialog(null,
						 " Olé mi niño que arte tiene que le ha dado una buena estocada a "+enemigo.getNombre());

			}
		}

	}

}
