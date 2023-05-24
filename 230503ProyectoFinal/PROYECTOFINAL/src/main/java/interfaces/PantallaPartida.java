package interfaces;


import javax.swing.JPanel;

import personaje.Personaje;
import javax.swing.JButton;
import javax.swing.JLabel;


public class PantallaPartida extends JPanel {
	
	private Ventana ventana;

	public PantallaPartida(Ventana v,Personaje jugador, Personaje enemigo) {

		this.ventana = v;
		setLayout(null);
		
		JLabel imagenJugador = new JLabel("");
		imagenJugador.setBounds(33, 29, 68, 80);
		imagenJugador.setIcon(jugador.getImagen());
		add(imagenJugador);
		
		JLabel imagenEnemigo = new JLabel("");
		imagenEnemigo.setBounds(327, 29, 68, 80);
		imagenEnemigo.setIcon(enemigo.getImagen());
		add(imagenEnemigo);
		
		

	}
}
