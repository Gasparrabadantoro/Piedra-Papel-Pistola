package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class PantallaWinner extends JPanel {

	
	private Ventana ventana;

	public PantallaWinner(Ventana v) {
		setBackground(new Color(0, 0, 0));

		this.ventana = v;
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENHORABUENA, HAS GANADO. ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Zephyrean BRK", Font.PLAIN, 28));
		lblNewLabel.setBounds(231, 52, 391, 44);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Gaspar\\Documents\\GitHub\\Piedra-Papel-Pistola\\230503ProyectoFinal\\PROYECTOFINAL\\images\\caritaFeliz.png"));
		lblNewLabel_1.setBounds(292, 107, 177, 102);
		add(lblNewLabel_1);
		
		

	}
}
