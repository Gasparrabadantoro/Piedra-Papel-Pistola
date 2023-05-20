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

public class PantallaInicio extends JPanel{
	
	private Ventana ventana;
	
	public PantallaInicio(Ventana v) {
		
		this.ventana=v;
		// con esto 
		this.setBackground(new Color(0,0,0));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{800, 0};
		gridBagLayout.rowHeights = new int[]{500, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
	}
}
