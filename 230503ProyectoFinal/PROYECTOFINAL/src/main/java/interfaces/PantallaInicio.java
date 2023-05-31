package interfaces;

import java.awt.Color;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class PantallaInicio extends JPanel {
	
	private Ventana ventana;

	public PantallaInicio(Ventana v) {
		setBackground(new Color(0, 0, 0));
		
		
		this.ventana = v;
		
		JButton botonJugar = new JButton("Jugar");
		botonJugar.setBackground(new Color(0, 0, 0));
		botonJugar.setBounds(249, 80, 171, 49);
		botonJugar.setVerticalAlignment(SwingConstants.TOP);
		botonJugar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				v.cambiarAPantalla(PantallaEleccionPersonaje.class, null, null);
				
			}
		});
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 0, 0);
		add(lblNewLabel_1);
		botonJugar.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 24));
		add(botonJugar);
		
		JButton botonSalir = new JButton("Salir");
		botonSalir.setBackground(new Color(0, 0, 0));
		botonSalir.setBounds(519, 80, 165, 49);
		botonSalir.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 33));
		add(botonSalir);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(".\\images\\Piedra.png"));
		lblNewLabel.setBounds(260, 174, 87, 49);
		add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(".\\images\\Papel.png"));
		lblNewLabel_2.setBounds(413, 174, 87, 49);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(".\\images\\revolver.png"));
		lblNewLabel_3.setBounds(595, 174, 87, 49);
		add(lblNewLabel_3);
		
		JTextPane txtpnBienvenidAlCampeonato = new JTextPane();
		txtpnBienvenidAlCampeonato.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		txtpnBienvenidAlCampeonato.setText("Bienvenid@ al campeonato oficial de Piedra-Papel-Pistola,\r\n¿Eres lo suficientemente valiente o tontuna como para meterte aqui?\r\n\r\nPulsa en Salir si eres un pusilánime total  o echale p*lotas al asunto ");
		txtpnBienvenidAlCampeonato.setBounds(260, 259, 426, 121);
		add(txtpnBienvenidAlCampeonato);
		
		JTextPane txtpnPiedrapapelpistola = new JTextPane();
		txtpnPiedrapapelpistola.setFont(new Font("Zephyrean Gust BRK", Font.PLAIN, 25));
		txtpnPiedrapapelpistola.setBackground(new Color(0, 0, 0));
		txtpnPiedrapapelpistola.setText("PIEDRA-PAPEL-PISTOLA");
		txtpnPiedrapapelpistola.setForeground(new Color(255, 255, 255));
		txtpnPiedrapapelpistola.setBounds(157, 28, 397, 41);
		add(txtpnPiedrapapelpistola);
		
		
		
		

		
}
}