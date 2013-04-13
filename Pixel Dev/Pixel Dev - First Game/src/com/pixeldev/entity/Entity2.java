package com.pixeldev.entity;

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
	
	/**  met à jour l'entity **/
	public abstract void onUpdate();
}
