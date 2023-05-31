package interfaces;


import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import armasConvencionales.Papel;
import armasConvencionales.Piedra;
import armasConvencionales.Tijera;
import personaje.Personaje;


public class PantallaPartida extends JPanel {
	
	private Ventana ventana;

	public PantallaPartida(Ventana v,Personaje jugador, Personaje enemigo) {
		setBackground(new Color(255, 255, 255));
		
		
		
		Tijera tijeraT=new Tijera("Tijera", 200, (byte) 2, new ImageIcon(".\\images\\Tijera.png"));
		Piedra piedraT=new Piedra("Piedra", 300, (byte) 2, new ImageIcon(".\\images\\Piedra.png"));
		Papel papelT=new Papel("Papel", 500, (byte) 2, new ImageIcon(".\\images\\Papel.png"));
		
		enemigo.setArmaActual(papelT);

	
		this.ventana = v;
		setLayout(null);
		/*Jugador*/
		JLabel imagenJugador = new JLabel("imagenJugador");
		imagenJugador.setBounds(38, 150, 80, 80);
		imagenJugador.setIcon(jugador.getImagen());
		add(imagenJugador);
		
		JLabel imagenEnemigo = new JLabel("imagenEnemigo");
		imagenEnemigo.setBounds(656, 150, 80, 80);
		imagenEnemigo.setIcon(enemigo.getImagen());
		add(imagenEnemigo);
		
		JLabel imagenPapel = new JLabel("");
		imagenPapel.setBounds(230, 150, 80, 80);
		imagenPapel.setIcon(jugador.getArmas().get(0).getImagen());
		add(imagenPapel);
		
		JLabel imagenPiedra = new JLabel("");
		imagenPiedra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			jugador.setArmaActual(new Piedra("Piedra", 200, (byte) 2,  new ImageIcon(".\\images\\Piedra.png")));
				
		
			jugador.eleccionArma(jugador, enemigo);
			
			
			}
		});
		imagenPiedra.setBounds(130, 240, 95, 80);
		imagenPiedra.setIcon(jugador.getArmas().get(1).getImagen());
		add(imagenPiedra);
		
		JLabel imagenTijera = new JLabel("");
		imagenTijera.setBounds(130, 57, 95, 80);
		imagenTijera.setIcon(jugador.getArmas().get(2).getImagen());
		add(imagenTijera);
		
		JLabel enemigoTijera = new JLabel("");
		enemigoTijera.setBounds(529, 57, 80, 80);
		enemigoTijera.setIcon(enemigo.getArmas().get(2).getImagen());
		add(enemigoTijera);
		
		JLabel enemigoPapel = new JLabel("");
		enemigoPapel.setBounds(422, 150, 80, 80);
		enemigoPapel.setIcon(enemigo.getArmas().get(0).getImagen());
		add(enemigoPapel);
		
		JLabel enemigoPiedra = new JLabel("");
		
		
		enemigoPiedra.setBounds(529, 240, 80, 80);
		enemigoPiedra.setIcon(enemigo.getArmas().get(1).getImagen());
		add(enemigoPiedra);
		
		
		
		// ESTO mismo pero con todo lo demas, 
		/*JLabel imagenPiedra = new JLabel("");
		imagenPiedra.setBounds(10, 120, 80, 74);
		imagenPiedra.setIcon(jugador.getArmas().get(1).getImagen());
		add(imagenPiedra);*/
		
		

	}
}
