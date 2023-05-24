package interfaces;

import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import personaje.Momia;
import personaje.Torero;

import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaEleccionPersonaje extends JPanel {

	private Ventana ventana;

	// Seguir por aqui, meter mas Personajes

	public PantallaEleccionPersonaje(Ventana v) {
		setBackground(new Color(255, 255, 255));

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

				Random r = new Random();

				byte numeroAleatorio;

				numeroAleatorio = (byte) r.nextInt(4);

				v.personaje = new Momia(new ImageIcon(".\\images\\Personajes\\LaMomia.png"), null);
				v.enemigo = v.enemigos.get(numeroAleatorio);
				while (v.personaje == v.enemigo) {
					numeroAleatorio = (byte) r.nextInt(4);

					v.enemigo = v.enemigos.get(numeroAleatorio);
				}
				v.cambiarAPantalla(PantallaPartida.class, v.personaje, v.enemigo);
			}
		});

		JLabel imagenVaquero = new JLabel("");
		imagenVaquero.setBounds(349, 21, 116, 133);
		add(imagenVaquero);

		try {
			BufferedImage imagen2 = ImageIO.read(new File(".\\images\\Personajes\\Vaquero.png"));
			Image enIcono2 = imagen2.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			imagenVaquero.setIcon(new ImageIcon(enIcono2));

			JTextPane txtVaquero = new JTextPane();
			txtVaquero.setText(
					"No hay tirador mas rapido\r\nen el mundo,o por lo menos\r\neso dice su mujer. Letal Arma\r\nRevolver 45 Colt \r\n\r\nArma Especial - Revolver- 500 daño\r\ncon probabilidad de acertar entre 1 y 10. ");
			txtVaquero.setBounds(318, 185, 226, 118);
			add(txtVaquero);

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		JLabel imagenSamurai = new JLabel("");
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
			textoSamurai.setText(
					"Formidable Guerrera de las montañas\r\nde Sengoku, corta rollos profesional\r\nsegún sus hijos. Cortara en mil pedazos\r\ntu carrera como programador. \r\n\r\nArma especial -Katana- 200 de daño \r\n");
			textoSamurai.setBounds(35, 460, 226, 129);
			add(textoSamurai);

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		JLabel imagenTorero = new JLabel("");
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
			textoTorero.setText(
					"Guerrero Torero nasio en \r\nMálaga...mirar que postre\r\ny que lustre,con un estoque\r\nque te puede llegar al corazón,\r\nRamírez es un rompe corazones. \r\n\r\nArma especial - Estoque 400 de daño.");
			textoTorero.setBounds(318, 460, 226, 129);
			add(textoTorero);

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
}
