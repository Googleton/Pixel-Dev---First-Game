package com.pixeldev.powers;

import org.newdawn.slick.Image;

public abstract class Power 
{
	public Power[] powerList = new Power[4096];
	
	public Image powerSprite;
	
	/** constructeur du pouvoir
	 * @param Image du pouvoir **/
	public Power(Image image)
	{
		this.powerSprite = image;
	}
	
	/** effet du pouvoir **/
	public abstract void effect();
}
