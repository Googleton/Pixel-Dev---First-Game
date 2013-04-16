package com.pixeldev.states;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class MenuState extends BasicGameState {

	public Image playButton;
	public Image quitButton;
	public int playBx, playBy;
	public int quitBx, quitBy;
	
	@Override
	public void init(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
		playBx = 540;
		playBy = 150;
		quitBx = 515;
		quitBy = 200;
		playButton = new Image("/res/guis/playButton.png");
		quitButton = new Image("/res/guis/quitButton.png");
	}

	@Override
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics arg2)
			throws SlickException {
		playButton.draw(playBx, playBy);
		quitButton.draw(quitBx, quitBy);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		
		if(gc.getInput().getMouseX() > playBx && gc.getInput().getMouseY() > playBy && gc.getInput().getMouseX() < playBx + playButton.getWidth()
				&& gc.getInput().getMouseY() < playBy + playButton.getHeight() && gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)){
			sbg.enterState(1);
		} else if (gc.getInput().getMouseX() > quitBx && gc.getInput().getMouseY() > quitBy && gc.getInput().getMouseX() < quitBx + quitButton.getWidth()
				&& gc.getInput().getMouseY() < quitBy + quitButton.getHeight() && gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			gc.exit();
		}

	}

	@Override
	public int getID() {
		return 0;
	}

}
