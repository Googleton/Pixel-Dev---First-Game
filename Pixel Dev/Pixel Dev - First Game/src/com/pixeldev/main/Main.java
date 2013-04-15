package com.pixeldev.main;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import com.pixeldev.guis.GameInputListener;
import com.pixeldev.states.GameState;
import com.pixeldev.states.MenuState;

public class Main extends StateBasedGame {
	private GameState jeu;
	private MenuState menu;
	private AppGameContainer container;

	public Main() {
		super("Pixel Dev' - Game 1");
	} 

	/** Charge la liste des états possibles du jeu ( Menu, InGame )**/
	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		if (container instanceof AppGameContainer) {
			this.container = (AppGameContainer) container;
		}
		
		container.getInput().addListener(new GameInputListener());
		
		menu = new MenuState();
		jeu = new GameState();
		container.setShowFPS(false);
		addState(menu);
		addState(jeu);
	}

	/** Fonction principale du jeu **/
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
