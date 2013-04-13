package com.pixeldev.states;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import com.pixeldev.entity.EntityPlayer;
import com.pixeldev.guis.GuiInGame;

public class GameState extends BasicGameState {
	public static final int ID = 1;

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

	}

	/** Affiche les choses a l'écran **/
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException
	{
		gig.drawScreen(player.currentPower);
//		g.drawString(String.valueOf(player.money), , y)
	}

	/** Mets a jour ( 1 update / frame ) **/
	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {
		if (container.getInput().isKeyPressed(Input.KEY_RIGHT))
			player.setCurrentPower(player.currentPower + 1);
		else if (container.getInput().isKeyPressed(Input.KEY_LEFT))
			player.setCurrentPower(player.currentPower - 1);
	}
}
