package interfaces;

import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import armasConvencionales.Arma;
import personaje.Momia;
import personaje.Personaje;
import personaje.Samurai;
import personaje.Torero;
import personaje.Vaquero;
import utils.DAO;

import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaEleccionPersonaje extends JPanel {

	private Ventana ventana;
	private ArrayList<Arma>armas;
	private ArrayList<Personaje>personaje;
	protected ArrayList<Personaje> enemigos;
	

	// Seguir por aqui, meter mas Personajes
	
	

	public PantallaEleccionPersonaje(Ventana v) {
		setBackground(new Color(255, 255, 255));
		
		this.enemigos=new ArrayList<Personaje>();
		enemigos.add(new Momia(getName(), 10, new ImageIcon(".\\images\\Personajes\\LaMomia.png"),armas));
		enemigos.add(new Torero(getName(),10,new ImageIcon(".\\images\\Personajes\\Torero.png"),armas));
		enemigos.add(new Vaquero(getName(),10,new ImageIcon(".\\images\\Personajes\\Torero.png"),armas));
		enemigos.add(new Samurai(getName(), 10, new ImageIcon(".\\images\\Personajes\\Samurai.png"),armas));
		/*enemigos.add(new Torero(getName(), 650, new ImageIcon(".\\images\\Personajes\\Torero.png"),armas,null));
		enemigos.add(new Vaquero(getName(), 400, new ImageIcon(".\\images\\Personajes\\Vaquero.png"),armas, null));
		enemigos.add(new Samurai(getName(), 500, new ImageIcon(".\\images\\Personajes\\Samurai.png"),armas, null));*/

		this.ventana = v;
		setLayout(null);

		JLabel textoElegirPersonaje = new JLabel("ELIJE TU CAMPEON");
		textoElegirPersonaje.setFont(new Font("Zephyrean Gust BRK", Font.PLAIN, 27));
		textoElegirPersonaje.setBounds(565, 0, 175, 33);
		add(textoElegirPersonaje);

		JLabel TituloMomia = new JLabel("HashSetSut La Momia");
		TituloMomia.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		TituloMomia.setVerticalAlignment(SwingConstants.TOP);
		TituloMomia.setBounds(35, 165, 154, 20);
		add(TituloMomia);

		JTextPane textoMomia = new JTextPane();
		textoMomia.setEditable(false);
		textoMomia.setText(
				"Recien llegada de las profundidades \r\ndel Cairo. Su escudo te protegera de \r\ntodos los males, escepto de pagar \r\na Hacienda, haciendo hay que pagarla. \r\n\r\nArma especial - Escudo- Proteje de Ataques");
		textoMomia.setBounds(35, 185, 243, 115);
		add(textoMomia);
		// Momia
		JLabel imagenMomia = new JLabel("");
		imagenMomia.setBounds(35, 21, 116, 133);
		add(imagenMomia);

		try {
			BufferedImage imagen = ImageIO.read(new File(".\\images\\Personajes\\LaMomia.png"));
			Image enIcono = imagen.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			imagenMomia.setIcon(new ImageIcon(enIcono));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		imagenMomia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				

				ventana.personajeElegido=0;
				
				Random r = new Random();

				byte numeroAleatorio;

				numeroAleatorio = (byte) r.nextInt(4);

				v.jugador = new Momia("HashSetSut La Momia ", 400,new ImageIcon(".\\images\\Personajes\\LaMomia.png"),v.armas);
				
				v.enemigo = v.enemigos.get(numeroAleatorio);
				
				
				while (	ventana.personajeElegido== numeroAleatorio) {
					
					
					
					numeroAleatorio = (byte) r.nextInt(4);

					v.enemigo = v.enemigos.get(numeroAleatorio);
				}
				
				v.personajeEnemigo=numeroAleatorio;
				v.cambiarAPantalla(PantallaPartida.class, v.jugador, v.enemigo);
			}
		});

		JLabel imagenVaquero = new JLabel("");
		imagenVaquero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				ventana.personajeElegido=1;
				Random r = new Random();

				byte numeroAleatorio;

				numeroAleatorio = (byte) r.nextInt(4);

				v.jugador = new Vaquero(new ImageIcon(".\\images\\Personajes\\Vaquero.png"), v.armas);
				v.enemigo = v.enemigos.get(numeroAleatorio);
				while (	ventana.personajeElegido == numeroAleatorio) {
					numeroAleatorio = (byte) r.nextInt(4);

					v.enemigo = v.enemigos.get(numeroAleatorio);
				}
				v.personajeEnemigo=numeroAleatorio;
				v.cambiarAPantalla(PantallaPartida.class, v.jugador, v.enemigo);
			
			}
		});
		imagenVaquero.setBounds(349, 21, 116, 133);
		add(imagenVaquero);

		try {
			BufferedImage imagen2 = ImageIO.read(new File(".\\images\\Personajes\\Vaquero.png"));
			Image enIcono2 = imagen2.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			imagenVaquero.setIcon(new ImageIcon(enIcono2));

			JTextPane txtVaquero = new JTextPane();
			txtVaquero.setEditable(false);
			txtVaquero.setText(
					"No hay tirador mas rapido\r\nen el mundo,o por lo menos\r\neso dice su mujer. Letal Arma\r\nRevolver 45 Colt \r\n\r\nArma Especial - Revolver- 500 daño\r\ncon probabilidad de acertar entre 1 y 10. ");
			txtVaquero.setBounds(318, 185, 226, 118);
			add(txtVaquero);

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		JLabel imagenSamurai = new JLabel("");
		imagenSamurai.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				ventana.personajeElegido=2;
				
				Random r = new Random();

				byte numeroAleatorio;

				numeroAleatorio = (byte) r.nextInt(4);

				v.jugador = new Samurai(new ImageIcon(".\\images\\Personajes\\Samurai.png"),v.armas);
			
				v.enemigo = v.enemigos.get(numeroAleatorio);
				while (	ventana.personajeElegido == numeroAleatorio ) {
					numeroAleatorio = (byte) r.nextInt(4);

					v.enemigo = v.enemigos.get(numeroAleatorio);
				}
				v.personajeEnemigo=numeroAleatorio;
				v.cambiarAPantalla(PantallaPartida.class, v.jugador, v.enemigo);
			
			}
				
			
		});
		imagenSamurai.setBounds(35, 311, 116, 133);
		add(imagenSamurai);

		try {
			BufferedImage imagen3 = ImageIO.read(new File(".\\images\\Personajes\\Samurai.png"));
			Image enIcono3 = imagen3.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			imagenSamurai.setIcon(new ImageIcon(enIcono3));

			JLabel TituloVaquero = new JLabel("Shakur El Vaquero");
			TituloVaquero.setVerticalAlignment(SwingConstants.TOP);
			TituloVaquero.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
			TituloVaquero.setBounds(318, 165, 154, 20);
			add(TituloVaquero);

			JLabel TituloSamurai = new JLabel("Tomoe La Samurai");
			TituloSamurai.setVerticalAlignment(SwingConstants.TOP);
			TituloSamurai.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
			TituloSamurai.setBounds(35, 438, 154, 20);
			add(TituloSamurai);

			JTextPane textoSamurai = new JTextPane();
			textoSamurai.setEditable(false);
			textoSamurai.setText(
					"Formidable Guerrera de las montañas\r\nde Sengoku, corta rollos profesional\r\nsegún sus hijos. Cortara en mil pedazos\r\ntu carrera como programador. \r\n\r\nArma especial -Katana- 200 de daño \r\n");
			textoSamurai.setBounds(35, 460, 226, 129);
			add(textoSamurai);

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		JLabel imagenTorero = new JLabel("");
		imagenTorero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				ventana.personajeElegido=3;

				Random r = new Random();

				byte numeroAleatorio;

				numeroAleatorio = (byte) r.nextInt(4);

				v.jugador = new Torero(new ImageIcon(".\\images\\Personajes\\Torero.png"),v.armas);
				v.enemigo = v.enemigos.get(numeroAleatorio);
				while (	ventana.personajeElegido == numeroAleatorio) {
					numeroAleatorio = (byte) r.nextInt(4);

					v.enemigo = v.enemigos.get(numeroAleatorio);
				}
				v.personajeEnemigo=numeroAleatorio;
				v.cambiarAPantalla(PantallaPartida.class, v.jugador, v.enemigo);
			
			}
		});
		imagenTorero.setBounds(349, 311, 116, 133);
		add(imagenTorero);

		try {
			BufferedImage imagen4 = ImageIO.read(new File(".\\images\\Personajes\\Torero.png"));
			Image enIcono4 = imagen4.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			imagenTorero.setIcon(new ImageIcon(enIcono4));

			JLabel TituloTorero = new JLabel("Ramírez El Torero");
			TituloTorero.setVerticalAlignment(SwingConstants.TOP);
			TituloTorero.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
			TituloTorero.setBounds(318, 438, 154, 20);
			add(TituloTorero);

			JTextPane textoTorero = new JTextPane();
			textoTorero.setEditable(false);
			textoTorero.setText(
					"Guerrero Torero nasio en \r\nMálaga...mirar que postre\r\ny que lustre,con un estoque\r\nque te puede llegar al corazón,\r\nRamírez es un rompe corazones. \r\n\r\nArma especial - Estoque 400 de daño.");
			textoTorero.setBounds(318, 460, 226, 129);
			add(textoTorero);
			
			// CONSULTAR VICTORIAS 
			
			
			
			
			JLabel victoriaMomia = new JLabel("Victoria :"+victorias("momia"));
			victoriaMomia.setBounds(192, 170, 86, 14);
			add(victoriaMomia);
			
			JLabel victoriaVaquera = new JLabel("Victoria:"+victorias("vaquero"));
			victoriaVaquera.setBounds(454, 170, 116, 14);
			add(victoriaVaquera);
			
			JLabel victoriaSamurai = new JLabel("Victoria:"+victorias("samurai"));
			victoriaSamurai.setBounds(177, 443, 101, 14);
			add(victoriaSamurai);
			
			JLabel victoriaTorera = new JLabel("Victoria:"+victorias("torero"));
			victoriaTorera.setBounds(454, 443, 90, 14);
			add(victoriaTorera);
			
			

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// tienes un evento para cada imagen

		// elegirPersonaje evento boton{

		/*
		 * this.ventana.personaje=new ELPERSONAJEQUETOQUE();
		 * this.ventana.cambiarAPantalla(PantallaPartida.class,this.ventana.jugador,this
		 * .ventana.enemigos.get(0)); }
		 */
	}
	
	private static int victorias(String nombre) {
		
		
		HashSet <String>columnaVictoria=new HashSet<String>();
		columnaVictoria.add("numeroVictorias");
		
		HashMap<String,Object>restriccionesConsulta=new HashMap<String,Object>();
		restriccionesConsulta.put("nombrePersonaje",nombre);
		
		int numeroVictorias=-1;
			try {
				 numeroVictorias=(int) DAO.consultar("victorias", columnaVictoria, restriccionesConsulta).get(0);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			return numeroVictorias;
	}
}
