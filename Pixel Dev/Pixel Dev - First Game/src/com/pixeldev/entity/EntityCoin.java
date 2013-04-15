package com.pixeldev.entity;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class EntityCoin extends Entity2{

	private int moneyValue;
	
	/** Constructeur **/
	public EntityCoin(int mLife) {
		super(mLife);
	}
	
	/** Méthode pour regler la valeur de la pièce **/
	public void setMoneyValue(int value){
	moneyValue = value;	
	}
	
	/** Méthode appelée lors d'une collision pour ajouter l'argent au player **/
	public void giveMoney(EntityPlayer player){
		player.giveMoney(moneyValue);
	}

	@Override
	public void init(GameContainer container, StateBasedGame game)
			throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub
		
	}
}
