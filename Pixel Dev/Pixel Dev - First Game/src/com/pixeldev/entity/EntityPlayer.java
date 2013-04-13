package com.pixeldev.entity;

import com.pixeldev.powers.Power;

public class EntityPlayer extends Entity2 
{
	public Power[] powers = new Power[3];
	public Power currentPower;
	
	public EntityPlayer(int mLife) 
	{
		super(mLife);
	}
	
	/** change le pouvoir actuel du joueur **/
	public void setCurrentPower(int pos)
	{
		if(this.powers[pos] != null)
		{
			this.currentPower = this.powers[pos];
		}
	}

	/** met à jour l'entity **/
	public void onUpdate() 
	{
		
	}
}
