package com.pixeldev.states;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class GameState extends BasicGameState {
	public static final int ID = 1;
	
	public Image surprise;

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
		g.drawString("Surprise motherfucker !", 100, 50);
		surprise.draw(180, 80);
	}

	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {

	}
}