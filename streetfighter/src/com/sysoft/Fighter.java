package com.sysoft;

public class Fighter extends Person
{
	int locationX;
	int locationY;
	FacingDirection direction;


	public Fighter()
	{
		super();
		locationX = 0;
		locationY = 0;
		direction = FacingDirection.RIGHT;
	}

	public Fighter(String initName, int initHeight, int initWeight, int initPower, int initHealth)
	{
		super(initName, initHeight, initWeight, initPower, initHealth);
	}

	public void punch(String targetLocation)
	{
		System.out.println("Punching the target location of " + targetLocation);
		
	}

	public void setDirection(FacingDirection newDirection)
	{
		direction = newDirection;
	}

	

	
}