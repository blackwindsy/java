package com.sysoft;

import java.awt.Image;
import java.util.HashMap;
import javax.swing.ImageIcon;


public class Fighter extends Person
{
	private static final int MOVE_INTERVAL = 10;
	private int maxX;
	private int maxY;
	private int locationX;
	private int locationY;
	private Image image;
	private FacingDirection direction;
	private HashMap<String, Object> imageStore;


	public Fighter()
	{
		super();
		locationX = 0;
		locationY = 0;
		direction = FacingDirection.RIGHT;
	}

	public Fighter(String initName, int initHeight, int initWeight, int initPower, int initHealth, 
			HashMap<String, Object> initImageStore, int initX, int initY, int initMaxX, int initMaxY, FacingDirection initDirection)
	{
		super(initName, initHeight, initWeight, initPower, initHealth);
		imageStore = initImageStore;
		image = (Image)initImageStore.get("default");
		locationX = initX;
		locationY = initY;
		maxX = initMaxX;
		maxY = initMaxY;
		direction = initDirection;
	}

	public Image getImage()
	{
		return image;
	}

	public int getLocationX()
	{
		return locationX;
	}
	
	public int getLocationY()
	{
		return locationY;
	}
	
	public void setLocation(int x, int y)
	{
		locationX = x;
		locationY = y;
	}

	public FacingDirection getDirection()
	{
		return direction;
	}
	
	public void setDirection(FacingDirection newDirection)
	{
		direction = newDirection;
	}


	public void makeMove(String input)
	{
		switch (input)
		{
			case "LEFT": if (locationX > MOVE_INTERVAL) locationX -= MOVE_INTERVAL;
				break;
			case "RIGHT": if (locationX < maxX + MOVE_INTERVAL) locationX += MOVE_INTERVAL;
				break;
			default: 
				break;
		}
	}

	

	public void punch(String targetLocation)
	{
		System.out.println("Punching the target location of " + targetLocation);
		
	}
	

	
}