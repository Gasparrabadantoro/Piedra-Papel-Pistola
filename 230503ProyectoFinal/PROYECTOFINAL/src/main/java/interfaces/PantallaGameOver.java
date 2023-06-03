package interfaces;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaGameOver extends JPanel {
	private Ventana ventana;

	public PantallaGameOver(Ventana v) {
		setBackground(new Color(0, 0, 0));

		this.ventana = v;
		setLayout(null);
		
		Label textoMoriste = new Label("MORISTE - ¿LO VOLVEMOS A INTENTAR?");
		textoMoriste.setFont(new Font("Zephyrean Gust BRK", Font.BOLD, 12));
		textoMoriste.setForeground(new Color(255, 255, 255));
		textoMoriste.setBounds(87, 39, 306, 22);
		add(textoMoriste);
		
		JLabel imagenMuerte = new JLabel("New label");
		imagenMuerte.setIcon(new ImageIcon(".\\images\\muerte.png"));
		imagenMuerte.setBounds(172, 80, 97, 105);
		add(imagenMuerte);
		
		JButton botonVolverAIntentar = new JButton("Yep !");
		botonVolverAIntentar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				v.cambiarAPantalla(PantallaEleccionPersonaje.class, null, null);
			}
		});
		botonVolverAIntentar.setBounds(182, 198, 89, 23);
		add(botonVolverAIntentar);

	}
}
