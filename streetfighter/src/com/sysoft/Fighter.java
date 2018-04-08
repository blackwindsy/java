package com.sysoft;

import java.awt.Image;
import java.util.HashMap;

import javax.net.ssl.ExtendedSSLSession;
import javax.swing.ImageIcon;


public class Fighter extends Person
{
	private static final int MOVE_INTERVAL = 10;
	private static final int JUMP_INTERVAL = 50;
	private int maxX;
	private int maxY;
	private int locationX;
	private int locationY;
	private int baseY;
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
			HashMap<String, Object> initImageStore, int initMaxX, int initMaxY, FacingDirection initDirection)
	{
		super(initName, initHeight, initWeight, initPower, initHealth);
		imageStore = initImageStore;
		image = (Image)initImageStore.get("default");
		maxX = initMaxX;
		maxY = initMaxY;
		direction = initDirection;
		// determine initial location based on max x,y, and direction
		if (direction == FacingDirection.RIGHT)
		{
			locationX = (int)(maxX * 0.1);
		}
		else
		{
			locationX = maxX - (int)(maxX * 0.1);
		}
		baseY = maxY - (int)(maxY * 0.4);
		locationY = baseY;
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
			case "LEFT":  if (locationX > MOVE_INTERVAL) locationX -= MOVE_INTERVAL;
				break;
			case "RIGHT": if (locationX < maxX + MOVE_INTERVAL) locationX += MOVE_INTERVAL;
				break;
			case "UP":    
				if (locationY >= baseY) 
				{
					locationY -= JUMP_INTERVAL;
				}
				//else 
				//{
				//	locationY = baseY;
				//}
				break;
			case "DOWN":  
				if (locationY <= baseY) 
				{
					locationY += JUMP_INTERVAL;
				}
				//else 
				//{
				//	locationY = baseY;
				//}
				break;
			default: 
				locationY = baseY;
				break;
		}
	}

	

	public void punch(String targetLocation)
	{
		System.out.println("Punching the target location of " + targetLocation);
		
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer(100);
		sb.append("Fighter: {  ");
		sb.append("name: ").append(getName());
		sb.append(",  ");
		sb.append("x: ").append(getLocationX());
		sb.append(",  ");
		sb.append("y: ").append(getLocationY());
		sb.append("  }");
		return sb.toString();
	}
	
}