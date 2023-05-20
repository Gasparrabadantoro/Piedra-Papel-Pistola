package interfaces;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.GridBagLayout;

public class Ventana extends JFrame {
	
	public Ventana() {
		//
		this.setContentPane(new PantallaInicio(this));
		// para hacerlo visible
		this.setVisible(true);
		// para el tamaño
		/*this.setSize(600, 500);*/
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// para el titulo
		this.setTitle("Piedra-Papel-Pistola");
		// para cerrar las ventanas en ejecucion (en plan para cuando se queda encendido
		// y tal no¿?NO???)
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Para poner la localizacion centrada
		this.setLocationRelativeTo(null);
		// Para que no se pueda cambiar el tamaño de la ventana
		this.setResizable(false);
		
		BufferedImage icono;
        try {
            icono = ImageIO.read(new File("images/hoz.png"));
            this.setIconImage(icono);
            GridBagLayout gridBagLayout = new GridBagLayout();
            gridBagLayout.columnWidths = new int[]{0};
            gridBagLayout.rowHeights = new int[]{0};
            gridBagLayout.columnWeights = new double[]{Double.MIN_VALUE};
            gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE};
            getContentPane().setLayout(gridBagLayout);
        } catch (IOException e) {
           
            e.printStackTrace();
        }
        
        

		
	}
	
	public void cambiarAPantalla(Class<?> clase) {
		this.getContentPane().setVisible(false);
		/*if (clase.equals(PantallaLogin.class)) {
			this.setContentPane(new PantallaLogin(this));

		}
		if(clase.equals(PantallaRegistro.class)) {
			this.setContentPane(new PantallaRegistro(this));
			
		
			
		}
		
		if(clase.equals(PantallaListado.class)) {
			this.setContentPane(new PantallaListado(this));
			
		
			
		}*/
		
		this.getContentPane().setVisible(true);

	}
}
