package interfaces;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import armaSamurai.Katana;
import armaTorera.Estoque;
import armasConvencionales.Papel;
import armasConvencionales.Piedra;
import armasConvencionales.Tijera;
import armasMomia.Escudo;
import armasVaquera.Revolver;
import personaje.Momia;
import personaje.Personaje;
import personaje.Samurai;
import personaje.Torero;
import personaje.Vaquero;
import utils.DAO;

public class PantallaPartida extends JPanel {

	private Ventana ventana;
	private Personaje jugador;
	private Personaje enemigo;
	

	public PantallaPartida(Ventana v, Personaje jugador, Personaje enemigo) {
		setBackground(new Color(255, 255, 255));
		
		Tijera tijeraT = new Tijera("Tijera", 0, (byte) 2, new ImageIcon(".\\images\\Tijera.png"));
		Piedra piedraT = new Piedra("Piedra", 0, (byte) 2, new ImageIcon(".\\images\\Piedra.png"));
		Papel papelT = new Papel("Papel", 0, (byte) 2, new ImageIcon(".\\images\\Papel.png"));
		Escudo escudoT = new Escudo("Escudo ", 0, (byte) 2, new ImageIcon(".\\images\\Escudo.png"));
		Revolver revolverT = new Revolver("Revolver ", 300, (byte) 2, new ImageIcon(".\\images\\revolver.png"));
		Katana katanaT = new Katana("Katana ", 300, (byte) 2, new ImageIcon(".\\images\\Katana.png"));
		Estoque estoqueT = new Estoque("Estoque ", 300, (byte) 2, new ImageIcon(".\\images\\estoque.png"));

		/*
		 * switch (numeroAleatorio) {
		 * 
		 * case 0: enemigo.setArmaActual(papelT);
		 * 
		 * break;
		 * 
		 * case 1: enemigo.setArmaActual(tijeraT);
		 * 
		 * break;
		 * 
		 * case 2: enemigo.setArmaActual(piedraT);
		 * 
		 * break;
		 * 
		 * 
		 * }
		 */

		this.ventana = v;
		setLayout(null);
		/* Jugador */
		JLabel imagenJugador = new JLabel("imagenJugador");
		imagenJugador.setBounds(38, 150, 80, 80);
		imagenJugador.setIcon(jugador.getImagen());
		add(imagenJugador);

		JLabel imagenEnemigo = new JLabel("imagenEnemigo");
		imagenEnemigo.setBounds(656, 150, 80, 80);
		imagenEnemigo.setIcon(enemigo.getImagen());
		add(imagenEnemigo);

		JLabel vidaPersonaje = new JLabel("Vida : " + jugador.getVida());
		vidaPersonaje.setBounds(38, 252, 80, 14);
		add(vidaPersonaje);

		JLabel vidaEnemigo = new JLabel("Vida : " + enemigo.getVida());
		vidaEnemigo.setBounds(656, 252, 80, 14);
		add(vidaEnemigo);

		JLabel imagenPapel = new JLabel("");
		imagenPapel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				jugador.setArmaActual(new Papel("Papel", 45, (byte) 2, new ImageIcon(".\\images\\Papel.png")));

				

				jugador.getArmaActual().getDaño();
				armaAleatoria(enemigo);

				jugador.eleccionArma(jugador, enemigo);

				vidaPersonaje.setText("Vida : " + jugador.getVida());
				vidaEnemigo.setText("Vida : " + enemigo.getVida());

				if (enemigo.getVida() <= 0) {
					
					sumarVictoria(v.personajeElegido);
					
					v.cambiarAPantalla(PantallaWinner.class, null, null);

				}else if(jugador.getVida()<=0) {
					
				
					sumarVictoria(v.personajeEnemigo);
					
					v.cambiarAPantalla(PantallaGameOver.class, null, null);
					
				}

			}

		});
		imagenPapel.setBounds(230, 150, 80, 80);
		imagenPapel.setIcon(v.jugador.getArmas().get(0).getImagen());
		add(imagenPapel);

		JLabel imagenPiedra = new JLabel("");
		imagenPiedra.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				jugador.setArmaActual(new Piedra("Piedra", 60, (byte) 2, new ImageIcon(".\\images\\Piedra.png")));

				armaAleatoria(enemigo);

				jugador.eleccionArma(jugador, enemigo);

				vidaPersonaje.setText("Vida : " + jugador.getVida());
				vidaEnemigo.setText("Vida : " + enemigo.getVida());

				jugador.setVida(jugador.getVida());
				enemigo.setVida(enemigo.getVida());

				if (enemigo.getVida() <= 0) {
					sumarVictoria(v.personajeElegido);

					v.cambiarAPantalla(PantallaWinner.class, null, null);

				}else if(jugador.getVida()<=0) {
					sumarVictoria(v.personajeEnemigo);
					
					v.cambiarAPantalla(PantallaGameOver.class, null, null);
					
				}

			}

		});
		imagenPiedra.setBounds(130, 240, 95, 80);
		imagenPiedra.setIcon(jugador.getArmas().get(1).getImagen());
		add(imagenPiedra);

		JLabel imagenTijera = new JLabel("");
		imagenTijera.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				jugador.setArmaActual(new Tijera("Tijera", 50, (byte) 2, new ImageIcon(".\\images\\Tijera.png")));

				armaAleatoria(enemigo);

				jugador.eleccionArma(jugador, enemigo);

				vidaPersonaje.setText("Vida : " + jugador.getVida());
				vidaEnemigo.setText("Vida : " + enemigo.getVida());

				jugador.setVida(jugador.getVida());
				enemigo.setVida(enemigo.getVida());

				if (enemigo.getVida() <= 0) {
					sumarVictoria(v.personajeElegido);

					v.cambiarAPantalla(PantallaWinner.class, null, null);

				}else if(jugador.getVida()<=0) {
					sumarVictoria(v.personajeEnemigo);
					
					v.cambiarAPantalla(PantallaGameOver.class, null, null);
					
				}

			}

		});
		imagenTijera.setBounds(128, 57, 95, 80);
		imagenTijera.setIcon(jugador.getArmas().get(2).getImagen());
		add(imagenTijera);

		JLabel jugadorImagenArmaEspecial = new JLabel("");
		jugadorImagenArmaEspecial.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				armaAleatoria(enemigo);

				jugador.armaEspecial(jugador, enemigo);


				vidaPersonaje.setText("Vida : " + jugador.getVida());
				vidaEnemigo.setText("Vida : " + enemigo.getVida());
				enemigo.setVida(enemigo.getVida());

				if (enemigo.getVida() <= 0) {
					
					sumarVictoria(v.personajeElegido);
					

					v.cambiarAPantalla(PantallaWinner.class, null, null);

				}else if(jugador.getVida()<=0) {
					
					sumarVictoria(v.personajeEnemigo);
					
					v.cambiarAPantalla(PantallaGameOver.class, null, null);
					
				}

			}
		});
		jugadorImagenArmaEspecial.setBounds(138, 150, 95, 80);

		if (jugador.getClass() == Vaquero.class) {
			jugadorImagenArmaEspecial.setIcon(jugador.getArmas().get(4).getImagen());
			add(jugadorImagenArmaEspecial);
		} else if (jugador.getClass() == Momia.class) {
			jugadorImagenArmaEspecial.setIcon(jugador.getArmas().get(3).getImagen());
			add(jugadorImagenArmaEspecial);
		} else if (jugador.getClass() == Samurai.class) {
			jugadorImagenArmaEspecial.setIcon(jugador.getArmas().get(5).getImagen());
			add(jugadorImagenArmaEspecial);
		} else if (jugador.getClass() == Torero.class) {
			jugadorImagenArmaEspecial.setIcon(jugador.getArmas().get(6).getImagen());
			add(jugadorImagenArmaEspecial);

		}

		JLabel enemigoTijera = new JLabel("");
		enemigoTijera.setBounds(529, 57, 95, 80);
		enemigoTijera.setIcon(enemigo.getArmas().get(2).getImagen());
		add(enemigoTijera);

		JLabel enemigoPapel = new JLabel("");
		enemigoPapel.setBounds(422, 150, 95, 80);
		enemigoPapel.setIcon(enemigo.getArmas().get(0).getImagen());
		add(enemigoPapel);

		JLabel enemigoPiedra = new JLabel("");

		enemigoPiedra.setBounds(529, 240, 95, 80);
		enemigoPiedra.setIcon(enemigo.getArmas().get(1).getImagen());
		add(enemigoPiedra);

		// }

		// ESTO mismo pero con todo lo demas,
		/*
		 * JLabel imagenPiedra = new JLabel(""); imagenPiedra.setBounds(10, 120, 80,
		 * 74); imagenPiedra.setIcon(jugador.getArmas().get(1).getImagen());
		 * add(imagenPiedra);
		 */

	}

	public void armaAleatoria(Personaje enemigo) {

		Random r = new Random();

		Tijera tijeraT = new Tijera("Tijera", 50, (byte) 2, new ImageIcon(".\\images\\Tijera.png"));
		Piedra piedraT = new Piedra("Piedra", 60, (byte) 2, new ImageIcon(".\\images\\Piedra.png"));
		Papel papelT = new Papel("Papel", 45, (byte) 2, new ImageIcon(".\\images\\Papel.png"));

		byte numeroAleatorio = (byte) r.nextInt(0, 3);
		switch (numeroAleatorio) {

		case 0:
			enemigo.setArmaActual(papelT);

			break;

		case 1:
			enemigo.setArmaActual(tijeraT);

			break;

		case 2:
			enemigo.setArmaActual(piedraT);

			break;

		}

	}
	
	private static void sumarVictoria(byte p) {
		

		try {	
			
			String ganador=Ventana.devolverNombrePersonaje(p);
			
		HashSet <String>columnaVictoria=new HashSet<String>();
		columnaVictoria.add("numeroVictorias");
		
		HashMap<String,Object>restriccionesConsulta=new HashMap<String,Object>();
		restriccionesConsulta.put("nombrePersonaje",ganador);
		
	
			int numeroVictorias=(int) DAO.consultar("victorias", columnaVictoria, restriccionesConsulta).get(0);
		
		
		// Numero Victorias
		HashSet<String>columnasSacar=new HashSet<String>();
		
		columnasSacar.add("numeroVictorias");
		
		// datos Modificar 
		HashMap<String,Object> datosModificar=new HashMap<String,Object>();
		datosModificar.put("numeroVictorias",++numeroVictorias);
		// Restricciones 
		
		HashMap<String,Object>restricciones=new HashMap<String,Object>();
		restricciones.put("nombrePersonaje",ganador);
		
		
		
	
			DAO.actualizar("victorias", datosModificar, restricciones);
			
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
