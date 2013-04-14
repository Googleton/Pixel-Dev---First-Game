package com.pixeldev.entity;

import java.awt.Font;
import java.io.InputStream;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.util.ResourceLoader;

import com.pixeldev.powers.Power;

public abstract class Entity2 
{
	protected boolean isDead;
	public double speed;
	public int maxLife, life;
	public double posX, posY;
	
	/** constructeur d'entity **/
	public Entity2(int mLife)
	{
		isDead = false;
		speed = 1.0F;
		maxLife = mLife;
		life = mLife;
	}
	
	/** @return si l'entity est morte ou non **/
	public boolean isDead()
	{
		return this.isDead || this.life <= 0;
	}

	
	/** Permet d'initialiser toutes les variables pour l'entitée. Notemment les textures, son et autres. **/
	public abstract void init(GameContainer container, StateBasedGame game) throws SlickException;
	
	/** met à jour l'entity 
	 * NOTE : Remplacé par la fonction update() de slick pour plus de cohérence avec le reste **/
	public abstract void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException;
	
	/** Fonction de render de l'entitée. Permet de lui mettre une texture **/
	public abstract void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException;

}
