package interfaces;

import javax.swing.JPanel;

import personaje.Personaje;
import utils.DAO;

import javax.swing.JLabel;
import java.awt.Font;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;

import javax.swing.ImageIcon;
import java.awt.Color;

public class PantallaWinner extends JPanel {

	
	private Ventana ventana;
	protected String  personajeElegido;
	protected String personajeEnemigo;

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
		lblNewLabel_1.setIcon(new ImageIcon(".\\images\\caritaFeliz.png"));
		lblNewLabel_1.setBounds(292, 107, 177, 102);
		add(lblNewLabel_1);
		
		String ganador=v.devolverNombrePersonaje(v.personajeElegido);
		
		HashSet <String>columnaVictoria=new HashSet<String>();
		columnaVictoria.add("numeroVictorias");
		
		HashMap<String,Object>restriccionesConsulta=new HashMap<String,Object>();
		restriccionesConsulta.put("nombrePersonaje",ganador);
		
	
			int numeroVictorias = 0;
			try {
				numeroVictorias = (int) DAO.consultar("victorias", columnaVictoria, restriccionesConsulta).get(0);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		JLabel numeroVictoriasLabel = new JLabel("Victorias totales :"+ numeroVictorias);
		numeroVictoriasLabel.setBounds(60, 71, 125, 14);
		add(numeroVictoriasLabel);
		
		

	}
}
