package interfaces;


import javax.swing.JPanel;

import personaje.Personaje;
import javax.swing.JButton;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import armasConvencionales.Papel;
import armasConvencionales.Piedra;
import armasConvencionales.Tijera;

import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.ImageIcon;


public class PantallaPartida extends JPanel {
	
	private Ventana ventana;

	public PantallaPartida(Ventana v,Personaje jugador, Personaje enemigo) {
		setBackground(new Color(255, 255, 255));

		this.ventana = v;
		setLayout(null);
		/*Jugador*/
		JLabel imagenJugador = new JLabel("");
		imagenJugador.setBounds(40, 29, 68, 80);
		imagenJugador.setIcon(jugador.getImagen());
		add(imagenJugador);
		
		JLabel imagenEnemigo = new JLabel("");
		imagenEnemigo.setBounds(528, 29, 68, 80);
		imagenEnemigo.setIcon(enemigo.getImagen());
		add(imagenEnemigo);
		
		JLabel imagenPapel = new JLabel("");
		imagenPapel.setBounds(230, 122, 80, 74);
		imagenPapel.setIcon(jugador.getArmas().get(0).getImagen());
		add(imagenPapel);
		
		JLabel imagenPiedra = new JLabel("");
		imagenPiedra.setBounds(109, 212, 80, 74);
		imagenPiedra.setIcon(jugador.getArmas().get(1).getImagen());
		add(imagenPiedra);
		
		JLabel imagenTijera = new JLabel("");
		imagenTijera.setBounds(159, 29, 68, 80);
		imagenTijera.setIcon(jugador.getArmas().get(2).getImagen());
		add(imagenTijera);
		
		
		
		// ESTO mismo pero con todo lo demas, 
		/*JLabel imagenPiedra = new JLabel("");
		imagenPiedra.setBounds(10, 120, 80, 74);
		imagenPiedra.setIcon(jugador.getArmas().get(1).getImagen());
		add(imagenPiedra);*/
		
		

	}
}
