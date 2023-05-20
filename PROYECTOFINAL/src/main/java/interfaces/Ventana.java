package interfaces;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Ventana extends JFrame {
	
	public Ventana() {
		
		//this.setContentPane();
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
        } catch (IOException e) {
           
            e.printStackTrace();
        }

		
	}
	
	
}
