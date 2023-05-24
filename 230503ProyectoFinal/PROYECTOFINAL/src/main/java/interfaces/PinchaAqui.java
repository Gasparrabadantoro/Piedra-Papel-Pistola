package interfaces;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PinchaAqui extends JPanel{
	private Ventana ventana;
	
	public PinchaAqui(Ventana v) {
		setBackground(new Color(0, 0, 0));

		this.ventana = v;
		
		JButton pinchaAquiButton = new JButton("Pincha Aqui si eres Brav@");
		pinchaAquiButton.setBounds(97, 116, 261, 73);
		pinchaAquiButton.setForeground(new Color(255, 255, 255));
		pinchaAquiButton.setBackground(new Color(0, 0, 0));
		
		pinchaAquiButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				v.cambiarAPantalla(PantallaInicio.class, null, null);
			}
		});
		setLayout(null);
		add(pinchaAquiButton);
		
		
	}
}
