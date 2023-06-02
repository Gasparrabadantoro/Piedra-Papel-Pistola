package interfaces;

import java.awt.image.BufferedImage;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

import armaSamurai.Katana;
import armaTorera.Estoque;
import armasConvencionales.Arma;
import armasConvencionales.Papel;
import armasConvencionales.Piedra;
import armasConvencionales.Tijera;
import armasMomia.Escudo;
import armasVaquera.Revolver;
import personaje.Momia;
import personaje.Personaje;
import personaje.Samurai;
import personaje.Torero;
import personaje.Vaquero;

import java.awt.GridBagLayout;

public class Ventana extends JFrame {

	
	protected ArrayList<Personaje> enemigos;
	protected ArrayList<Arma>armas;
	protected Personaje enemigo;
	protected Personaje jugador;
	
	
	
	public Ventana() {
		/*Armas Convencionales*/
		this.armas=new ArrayList<Arma>();
		
		armas.add(new Papel("Papel", 50, (byte) 1, new ImageIcon("images\\Papel.png")));
		armas.add(new Piedra("Piedra", 50, (byte) 2, new ImageIcon("images\\Piedra.png")));
		armas.add(new Tijera("Tijera", 50, (byte) 3, new ImageIcon("images\\Tijera.png")));
		
		/*Armas Especiales */
		/*ArmaEspecialMomia*/
		armas.add(new Escudo("Escudo", 0, (byte) 1, new ImageIcon("images\\Escudo.png")));
		/*ArmaEspecialVaquera*/
		armas.add(new Revolver("Revolver", 150, (byte) 2, new ImageIcon("images\\revolver.png")));
		/*ArmaEspecialSamurai*/
		armas.add(new Katana("Katana", 170, (byte) 3, new ImageIcon("images\\Katana.png")));
		/*ArmaEspecialTorera*/

		armas.add(new Estoque("Estoque",190,(byte)3,new ImageIcon("images\\estoque.png")));
		
		
		
	
		
		
		this.enemigos=new ArrayList<Personaje>();
		enemigos.add(new Momia(getName(), 300, new ImageIcon(".\\images\\Personajes\\LaMomia.png"),armas));
		enemigos.add(new Torero(getName(), 650, new ImageIcon(".\\images\\Personajes\\Torero.png"),armas,null));
		enemigos.add(new Vaquero(getName(), 400, new ImageIcon(".\\images\\Personajes\\Vaquero.png"),armas, null));
		enemigos.add(new Samurai(getName(), 500, new ImageIcon(".\\images\\Personajes\\Samurai.png"),armas, null));
		
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
            icono = ImageIO.read(new File("images/piedra.png"));
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
