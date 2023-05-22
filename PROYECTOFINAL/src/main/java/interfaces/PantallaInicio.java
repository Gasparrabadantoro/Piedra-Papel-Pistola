package interfaces;

import java.awt.Color;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Label;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaInicio extends JPanel{
	
	private Ventana ventana;
	private JButton botonIniciar;
	
	public PantallaInicio(Ventana v) {
		setBackground(new Color(0, 0, 0));
		setForeground(new Color(0, 0, 0));
		setLayout(null);
		// preguntar a miguel 
		
		JLabel iconoPapel = new JLabel("");
		iconoPapel.setIcon(new ImageIcon("D:\\Pixel art\\Piedra_papel_pistola\\ArmaConvencional\\Papel..png"));
		iconoPapel.setBounds(270, 106, 64, 52);
		add(iconoPapel);
		
		Label tituloLabel = new Label("PIEDRA-PAPEL-PISTOLA");
		tituloLabel.setBackground(new Color(255, 255, 255));
		tituloLabel.setAlignment(Label.CENTER);
		tituloLabel.setBounds(122, 78, 555, 22);
		add(tituloLabel);
		
		JLabel iconoPiedra = new JLabel("");
		iconoPiedra.setIcon(new ImageIcon("D:\\Pixel art\\Piedra_papel_pistola\\ArmaConvencional\\piedra..png"));
		iconoPiedra.setBounds(468, 106, 64, 52);
		add(iconoPiedra);
		
		JLabel iconoPistola = new JLabel("");
		iconoPistola.setIcon(new ImageIcon("D:\\Pixel art\\Piedra_papel_pistola\\ArmasTema\\ArmaVaquera\\revolver.png"));
		iconoPistola.setBounds(368, 106, 64, 52);
		add(iconoPistola);
		
		JLabel HashSetSut = new JLabel("");
		HashSetSut.setIcon(new ImageIcon("D:\\Pixel art\\Piedra_papel_pistola\\personajes\\HashSetSup.png"));
		HashSetSut.setBounds(304, 216, 240, 164);
		add(HashSetSut);
		
		botonIniciar = new JButton("Iniciar Juego");
		botonIniciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				ventana.cambiarAPantalla(PantallaEleccionPersonaje.class);
			}
		});
		botonIniciar.setBounds(232, 182, 127, 23);
		add(botonIniciar);
		
		JButton botonSalir = new JButton("Salir Juego");
		botonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonSalir.setBounds(379, 182, 127, 23);
		add(botonSalir);
		
	}
}
