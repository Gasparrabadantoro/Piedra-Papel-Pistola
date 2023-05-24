package interfaces;

import java.awt.image.BufferedImage;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


import personaje.Momia;
import personaje.Personaje;
import personaje.Samurai;
import personaje.Torero;
import personaje.Vaquero;

import java.awt.GridBagLayout;

public class Ventana extends JFrame {

	
	protected ArrayList<Personaje> enemigos;
	protected Personaje enemigo;
	protected Personaje personaje;
	
	public Ventana() {
		//
		this.enemigos=new ArrayList<Personaje>();
		enemigos.add(new Momia(getName(), 500, new ImageIcon(".\\images\\Personajes\\LaMomia.png"), null));
		enemigos.add(new Torero(getName(), 500, new ImageIcon(".\\images\\Personajes\\Torero.png"), null, null));
		enemigos.add(new Vaquero(getName(), 500, new ImageIcon(".\\images\\Personajes\\Vaquero.png"), null, null));
		enemigos.add(new Samurai(getName(), 500, new ImageIcon(".\\images\\Personajes\\Samurai.png"), null, null));
		
		//add a todos
		//Usa un intercambio de valores para intercambiar aleatoriamente dos posiciones del array 100 veces
		this.setContentPane(new PinchaAqui(this));
		// para hacerlo visible
		this.setVisible(true);
		// para el tamaño
		this.setSize(900,600);
		
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
	
	public void cambiarAPantalla(Class<?> clase,Personaje jugador, Personaje enemigo) {
		this.getContentPane().setVisible(false);
		
		
		if (clase.equals(PantallaInicio.class)) {
			this.setContentPane(new PantallaInicio(this));

		}
		
		if(clase.equals(PantallaEleccionPersonaje.class)) {
			this.setContentPane(new PantallaEleccionPersonaje(this));
			
		
			
		}
		if(clase.equals(PantallaPartida.class)) {
			this.setContentPane(new PantallaPartida(this,jugador,enemigo));
		}
		
		if(clase.equals(PantallaGameOver.class)) {
			this.setContentPane(new PantallaGameOver(this));
			
		
			
		}
		
		
		
		if(clase.equals(PantallaWinner.class)) {
			this.setContentPane(new PantallaWinner(this));
			
		
			
		}
		
		this.getContentPane().setVisible(true);

	}
}
