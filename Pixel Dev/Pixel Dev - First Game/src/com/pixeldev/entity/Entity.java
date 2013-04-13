package com.pixeldev.entity;

public class Entity {

	public int life;
	public int maxLife;
	public float movementSpeed;
	public String name;
	
	public Entity() {

	}
	
	public void setLife(int l){
		this.life = l;
	}
	
	public void setMaxLife(int mL){
		this.maxLife = mL;
	}
	
	public void setMovementSpeed(float mS){
		this.movementSpeed = mS;
	}

}
