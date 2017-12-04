package com.sysoft;

public class Person 
{
	private String name;
	private int height;
	private int weight;
	private int power;
	private int health;

	public Person()
	{
		name = "NONAME";
		height = 0;
		weight = 0;
		power = 0;
		health = 0;
	}

	public Person(String initName)
	{
		name = initName;
		height = 0;
		weight = 0;
		power = 0;
		health = 0;
	}

	public Person(String initName, int initHeight, int initWeight, int initPower, int initHealth)
	{
		name = initName;
		height = initHeight;
		weight = initWeight;
		power = initPower;
		health = initHealth;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String newName)
	{
		name = newName;
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int newHeight)
	{
		height = newHeight;
	}

	public int getWeight()
	{
		return weight;
	}

	public void setWeight(int newWeight)
	{
		weight = newWeight;
	}

	public int getPower()
	{
		return power;
	}

	public void setPower(int newPower)
	{
		power = newPower;
	}

	public int getHealth()
	{
		return health;
	}

	public void setHealth(int newHealth)
	{
		health = newHealth;
	}

	public void run(int time, int distance)
	{
		
	}

}