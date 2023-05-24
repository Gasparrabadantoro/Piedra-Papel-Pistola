package interfaces;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class PantallaEleccionPersonaje extends JPanel {

	private Ventana ventana;

	public PantallaEleccionPersonaje(Ventana v) {
		setBackground(new Color(255, 255, 255));

		this.ventana = v;
		setLayout(null);
		
		JLabel textoElegirPersonaje = new JLabel("ELIJE TU CAMPEON");
		textoElegirPersonaje.setFont(new Font("Zephyrean Gust BRK", Font.PLAIN, 27));
		textoElegirPersonaje.setBounds(175, 25, 243, 33);
		add(textoElegirPersonaje);
		
		JLabel TituloMomia = new JLabel("HashSetSut La Momia");
		TituloMomia.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		TituloMomia.setVerticalAlignment(SwingConstants.TOP);
		TituloMomia.setBounds(46, 169, 154, 20);
		add(TituloMomia);
		
		JTextPane textoMomia = new JTextPane();
		textoMomia.setText("Recien llegada de las profundidades \r\ndel Cairo. Su escudo te protegera de \r\ntodos los males, escepto de pagar \r\na Hacienda, haciendo hay que pagarla. ");
		textoMomia.setBounds(46, 200, 226, 69);
		add(textoMomia);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(46, 63, 124, 95);
		add(lblNewLabel);
		
		 //tienes un evento para cada imagen
		
		 // elegirPersonaje evento boton{

			/*this.ventana.personaje=new ELPERSONAJEQUETOQUE();
			this.ventana.cambiarAPantalla(PantallaPartida.class,this.ventana.jugador,this.ventana.enemigos.get(0));
	}*/
		}
	}


