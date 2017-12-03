package com.sysoft;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Fighter extends Person
{
	private int locationX;
	private int locationY;
	private ImageIcon defaultImageIcon;
	private Image defaultImage;
	private FacingDirection direction;


	public Fighter()
	{
		super();
		locationX = 0;
		locationY = 0;
		direction = FacingDirection.RIGHT;
	}

	public Fighter(String initName, int initHeight, int initWeight, int initPower, int initHealth, ImageIcon imageIcon, int x, int y, FacingDirection d)
	{
		super(initName, initHeight, initWeight, initPower, initHealth);
		defaultImageIcon = imageIcon;
		defaultImage = imageIcon.getImage();
		locationX = x;
		locationY = y;
		direction = d;
	}

	public Image getImage()
	{
		return defaultImage;
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




	

	public void punch(String targetLocation)
	{
		System.out.println("Punching the target location of " + targetLocation);
		
	}
	

	
}