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
	
	@Override
	public void init(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
		playBx = 150;
		playBy = 150;
		playButton = new Image("/res/guis/playButton.png");
	}

	@Override
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics arg2)
			throws SlickException {
		arg2.drawString("Clickez pour démarrer, Echap pour quitter",
				(1280 / 2 - 80), (720 / 2));
		playButton.draw(playBx, playBy);

	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta)
			throws SlickException {
		if (gc.getInput().isMousePressed(Input.MOUSE_LEFT_BUTTON)) {
			sbg.enterState(1);
		} else if (gc.getInput().isKeyPressed(Input.KEY_ESCAPE)) {
			gc.exit();
		}
		
		if(gc.getInput().getMouseX() > playBx && gc.getInput().getMouseY() > playBy && gc.getInput().getMouseX() < playBx + playButton.getWidth()
				&& gc.getInput().getMouseY() < playBy + playButton.getHeight()){
			sbg.enterState(1);
		}

	}

	@Override
	public int getID() {
		return 0;
	}

}
