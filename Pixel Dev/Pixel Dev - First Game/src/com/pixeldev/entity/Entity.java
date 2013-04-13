package com.pixeldev.entity;

public class Entity {

	private int life;
	private int maxLife;
	private float movementSpeed;
	private String entityName;
	
	public Entity(String name) {
		
		this.entityName = name;
		
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
	
	public int getLife() {
		return this.life;
	}
	
	public int getMaxLife() {
		return this.maxLife;
	}
	
	public float getMovementSpeed() {
		return this.movementSpeed;
	}
	
	public String getEntityName() {
		return this.entityName;
	}
}
