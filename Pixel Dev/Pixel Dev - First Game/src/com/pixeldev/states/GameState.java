package com.pixeldev.states;

import java.awt.Font;
import java.io.InputStream;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.util.ResourceLoader;

import com.pixeldev.entity.EntityPlayer;
import com.pixeldev.guis.GuiInGame;

public class GameState extends BasicGameState {
	public static final int ID = 1;

	TrueTypeFont font;
	TrueTypeFont font2;
	private GuiInGame gig = new GuiInGame();
	public EntityPlayer player = new EntityPlayer(5000);

	/** @return l'id du status de jeu **/
	@Override
	public int getID() 
	{
		return ID;
	}

	/** Charge toutes les données ( Textures principalement ) **/
	public void init(GameContainer container, StateBasedGame game) throws SlickException 
	{

	    // load font from a .ttf file
	    try {
	        InputStream inputStream = ResourceLoader.getResourceAsStream("res/fonts/testfont.ttf");
	        
	        Font awtFont2 = Font.createFont(Font.TRUETYPE_FONT, inputStream);
	        awtFont2 = awtFont2.deriveFont(28f); // set font size
	        font2 = new TrueTypeFont(awtFont2, false);

	    } catch (Exception e) {
	        e.printStackTrace();
	    } 
		
		
	}

	/** Affiche les choses a l'écran **/
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException
	{
		font2.drawString( 1100, 50, "FPS : " + container.getFPS());
		gig.drawScreen(player.currentPower);
		player.render(container, game, g);
//		g.drawString(String.valueOf(player.money), , y)
	}

	/** Mets a jour ( 1 update / frame ) **/
	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {
		if (container.getInput().isKeyPressed(Input.KEY_RIGHT))
			player.setCurrentPower(player.currentPower + 1);
		else if (container.getInput().isKeyPressed(Input.KEY_LEFT))
			player.setCurrentPower(player.currentPower - 1);
		
		if (container.getInput().isKeyPressed(Input.KEY_ESCAPE)){
			container.exit();
		}
		
		player.update(container, game, delta);
	}
}
