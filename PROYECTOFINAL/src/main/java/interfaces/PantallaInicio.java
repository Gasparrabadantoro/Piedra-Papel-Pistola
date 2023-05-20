package interfaces;

import java.awt.Color;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;

public class PantallaInicio extends JPanel{
	
	private Ventana ventana;
	
	public PantallaInicio(Ventana v) {
		
		this.ventana=v;
		// con esto 
		this.setBackground(new Color(0,0,0));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Piedra-Papel-Pistola");
		lblNewLabel.setBounds(262, 48, 348, 49);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		add(lblNewLabel);
		
	}
	
	

}
