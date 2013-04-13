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
	
	public Image surprise;
	private GuiInGame gig = new GuiInGame();
	public EntityPlayer player = new EntityPlayer(20);

	@Override
	public int getID() {
		return ID;
	}

	public void init(GameContainer container, StateBasedGame game)
			throws SlickException {

		surprise = new Image("/res/surprise.jpg");
		
	}

	public void render(GameContainer container, StateBasedGame game, Graphics g)
			throws SlickException {
		g.drawString("Surprise motherfucker", 100, 150);
		surprise.draw(180, 180);
		gig.drawScreen(player.currentPower);
	}

	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {
		if(container.getInput().isKeyPressed(Input.KEY_RIGHT))
			player.setCurrentPower(player.currentPower + 1);
		else if(container.getInput().isKeyPressed(Input.KEY_LEFT))
			player.setCurrentPower(player.currentPower - 1);
	}
}