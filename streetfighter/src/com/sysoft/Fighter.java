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

	public Fighter(String initName, int initHeight, int initWeight, int initPower, int initHealth, ImageIcon imageIcon)
	{
		super(initName, initHeight, initWeight, initPower, initHealth);
		defaultImageIcon = imageIcon;
		defaultImage = imageIcon.getImage();
	}

	public FacingDirection getDirection()
	{
		return direction;
	}

	public Image getImage()
	{
		return defaultImage;
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