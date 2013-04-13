package com.pixeldev.main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import com.pixeldev.guis.GameInputListener;
import com.pixeldev.states.GameState;

public class Main extends StateBasedGame {
	private GameState jeu;
	@SuppressWarnings("unused")
	private AppGameContainer container;

	public Main() {
		super("Pixel Dev' - Game 1");
	} 

	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		if (container instanceof AppGameContainer) {
			this.container = (AppGameContainer) container;
		}
		
		container.getInput().addListener(new GameInputListener());
		
		jeu = new GameState();
		container.setShowFPS(true);
		addState(jeu);
	}

	public static void main(String[] args) {
		try {
			AppGameContainer container = new AppGameContainer(new Main());
			container.setDisplayMode(1280, 720, false);
			
			container.setTargetFrameRate(120);
			container.start();
		} catch (SlickException e) {
			e.printStackTrace();
		} 
	}
}
