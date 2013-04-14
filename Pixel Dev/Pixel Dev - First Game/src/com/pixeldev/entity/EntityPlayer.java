package com.pixeldev.entity;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import com.pixeldev.powers.Power;

public class EntityPlayer extends Entity2 
{
	public Power[] powers = new Power[3];
	public int currentPower;
	
	public int money = 0;
	
	public EntityPlayer(int mLife) 
	{
		super(mLife);
	}
	
	/** Permet d'initaliser les variables, ou de charger textures, sons et autres **/
	@Override
	public void init(GameContainer container, StateBasedGame game)
			throws SlickException {
		// TODO Auto-generated method stub
		
	}
	
	/** change le pouvoir actuel du joueur **/
	public void setCurrentPower(int pos)
	{
		if(pos > 2)
			this.currentPower = 2;
		else if(pos < 0)
			this.currentPower = 0;
		else
			this.currentPower = pos;
	}

	/** Mets a jour l'entitée **/
	@Override
	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {
		// TODO Auto-generated method stub
		
	}
	
	/** Permet d'afficher les textures liées a l'entitée, ou du texte. **/
	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g)
			throws SlickException {
		
	}

}
