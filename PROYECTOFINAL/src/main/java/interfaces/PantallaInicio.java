package interfaces;

import java.awt.Color;

import javax.swing.JPanel;

public class PantallaInicio extends JPanel{
	
	private Ventana ventana;
	
	public PantallaInicio(Ventana v) {
		
		this.ventana=v;
		// con esto 
		this.setBackground(new Color(128,0,0));
		
	}
	
	

}
