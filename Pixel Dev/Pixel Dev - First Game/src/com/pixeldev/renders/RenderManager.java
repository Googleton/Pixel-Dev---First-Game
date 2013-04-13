package com.pixeldev.renders;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class RenderManager 
{
  public SpriteSheet allBlocksTextures;
	
	/** Constructeur **/
	public RenderManager()
	{
		try 
		{
			this.allBlocksTextures = new SpriteSheet("res/textures.png", 64, 32);
		} 
		catch (SlickException e) 
		{
			e.printStackTrace();
		}
	}
}
