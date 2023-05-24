package personaje;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import armaSamurai.ArmaSamurai;
import armasConvencionales.Arma;

public class TomoeLaSamurai extends Personaje {
	
	private ArmaSamurai armaSamurai;

	public TomoeLaSamurai(String nombre, int vida, ImageIcon imagen, ArrayList<Arma> armas,ArmaSamurai armaSamurai ) {
		super(nombre, vida, imagen, armas);
		
		this.armaSamurai=armaSamurai;
	
		
		
	}

	@Override
	public void lanzarDecision() {
		// TODO Auto-generated method stub
		super.lanzarDecision();
	}

	
}
