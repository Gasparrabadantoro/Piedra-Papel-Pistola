package interfaces;

import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class PantallaEleccionPersonaje extends JPanel {

	private Ventana ventana;

	public PantallaEleccionPersonaje(Ventana v) {
		setBackground(new Color(0, 255, 64));

		this.ventana = v;
		setLayout(null);
		
		JLabel textoElegirPersonaje = new JLabel("ElijePersonaje");
		textoElegirPersonaje.setBounds(196, 25, 136, 14);
		add(textoElegirPersonaje);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(65, 92, 89, 23);
		add(btnNewButton);

	}

}
