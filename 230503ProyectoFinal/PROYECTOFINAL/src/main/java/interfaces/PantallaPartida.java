package interfaces;


import javax.swing.JPanel;

import personaje.Personaje;


public class PantallaPartida extends JPanel {
	
	private Ventana ventana;

	public PantallaPartida(Ventana v,Personaje jugador, Personaje enemigo) {

		this.ventana = v;

	}

}
