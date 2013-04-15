package com.pixeldev.entity;

import javax.swing.text.Position;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;

import com.pixeldev.powers.Power;

public class EntityPlayer extends Entity2 
{
	public Power[] powers = new Power[3];
	public int currentPower;
	public int x;
	public int y;
	
	public int money = 0;
	
	public EntityPlayer(int mLife) 
	{
		super(mLife);
	}
	
	/** Permet d'initaliser les variables, ou de charger textures, sons et autres **/
	@Override
	public void init(GameContainer container, StateBasedGame game)
			throws SlickException {
		x = 100;
		y = 100;
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
		if(Keyboard.isKeyDown(Keyboard.KEY_D)){
			x++;
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_Q)){
			x--;
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_Z)){
			y--;
		}
		if(Keyboard.isKeyDown(Keyboard.KEY_S)){
			y++;
		}
	}
	
	/** Permet d'afficher les textures liées a l'entitée, ou du texte. **/
	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g)
			throws SlickException {
		g.drawString("O", x, y);
	}
	
	/** Ajoute de la money au player. **/
	public void addMoney(int moneyToGive){
		money += moneyToGive;
	}

}
