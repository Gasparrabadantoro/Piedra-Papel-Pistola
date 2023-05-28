package personaje;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import armaSamurai.ArmaSamurai;
import armasConvencionales.Arma;

public class Samurai extends Personaje {
	
	private ArmaSamurai armaSamurai;

	public Samurai(String nombre, int vida, ImageIcon imagen, ArrayList<Arma> armas,ArmaSamurai armaSamurai ) {
		super(nombre, vida, imagen, armas);
		
		this.armaSamurai=armaSamurai;
	
		
		
	}

	
	public Samurai( ImageIcon imagen, ArrayList<Arma> armas) {
		super("Tomoe La Samurai",500, imagen, armas);
		
	}
	@Override
	public void lanzarDecision() {
		// TODO Auto-generated method stub
		super.lanzarDecision();
	}

	
}
