package com.pixeldev.guis;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class GuiInGame 
{
	private Image unSelected, selected;
	
	/** ce qui est à afficher à l'écran 
	 * @param pouvoir en cours d'utilisation par le joueur **/
	public void drawScreen(int i)
	{
		try 
		{
			this.unSelected = new Image("res/guis/unselected.png");
			this.selected = new Image("res/guis/selected.png");
		} 
		catch (SlickException e) 
		{
			e.printStackTrace();
		}
		
		if(i == 0)
		{
			selected.draw(30, 30);
			unSelected.draw(30 + 68, 30);
			unSelected.draw(30 + 68 * 2, 30);
		}
		else if(i == 1)
		{
			unSelected.draw(30, 30);
			selected.draw(30 + 68, 30);
			unSelected.draw(30 + 68 * 2, 30);
		}
		else if(i == 2)
		{
			unSelected.draw(30, 30);
			unSelected.draw(30 + 68, 30);
			selected.draw(30 + 68 * 2, 30);
		}
	}
}
