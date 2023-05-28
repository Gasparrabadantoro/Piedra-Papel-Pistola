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


public class PantallaPartida extends JPanel {
	
	private Ventana ventana;

	public PantallaPartida(Ventana v,Personaje jugador, Personaje enemigo) {
		setBackground(new Color(255, 255, 255));

		this.ventana = v;
		setLayout(null);
		/*Jugador*/
		JLabel imagenJugador = new JLabel("");
		imagenJugador.setBounds(33, 29, 68, 80);
		imagenJugador.setIcon(jugador.getImagen());
		add(imagenJugador);
		
		JLabel imagenEnemigo = new JLabel("");
		imagenEnemigo.setBounds(429, 29, 68, 80);
		imagenEnemigo.setIcon(enemigo.getImagen());
		add(imagenEnemigo);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("New JGoodies label");
		lblNewJgoodiesLabel.setBounds(9, 63, 92, 14);
		add(lblNewJgoodiesLabel);
		
		JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("New JGoodies label");
		lblNewJgoodiesLabel_1.setBounds(417, 63, 92, 14);
		add(lblNewJgoodiesLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(285, 0, 0, 363);
		add(separator);
		
		JLabel imagenPiedra = new JLabel("");
		imagenPiedra.setBounds(10, 120, 80, 74);
		imagenPiedra.setIcon(jugador.getArmas().get(1).getImagen());
		add(imagenPiedra);
		
		// ESTO mismo pero con todo lo demas, 
		/*JLabel imagenPiedra = new JLabel("");
		imagenPiedra.setBounds(10, 120, 80, 74);
		imagenPiedra.setIcon(jugador.getArmas().get(1).getImagen());
		add(imagenPiedra);*/
		
		

	}
}
