package com.pixeldev.entity;

import com.pixeldev.powers.Power;

public class EntityPlayer extends Entity2 
{
	public Power[] powers = new Power[3];
	public int currentPower;
	
	public EntityPlayer(int mLife) 
	{
		super(mLife);
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

	/** met à jour l'entity **/
	public void onUpdate() 
	{
		
	}
}
