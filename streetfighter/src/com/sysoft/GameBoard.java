package com.sysoft;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;



public class GameBoard extends JPanel implements ActionListener
{
	private static final long serialVersionUID = -34567876544567L;
	private Timer timer;
	private static final int DELAY = 10;

	Fighter fighterOne;
	Fighter fighterTwo;

	public GameBoard()
	{
		initBoard();
	}

	public GameBoard(Fighter fone, Fighter ftwo)
	{
		initBoard();
		loadFighter(fone, ftwo);
	}

	public void initBoard()
	{
		addKeyListener(new GameKeyListener());
		setFocusable(true);
		// timer triggers action listener to repaint
		timer = new Timer(DELAY, this);
		timer.start();
	}

	public void loadFighter(Fighter fone, Fighter ftwo)
	{
		fighterOne = fone;
		fighterTwo = ftwo;
	}

	@Override
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		doDrawing(g);
	}

	public void doDrawing(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;
		// makes the borders of the figures smoother
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.drawImage(fighterOne.getImage(), fighterOne.getLocationX(), fighterOne.getLocationY(), null);
		g2d.drawImage(fighterTwo.getImage(), fighterTwo.getLocationX(), fighterTwo.getLocationY(), null);
	}

	@Override
	public void actionPerformed(ActionEvent ae)
	{
		System.out.println("actionPerformed: ae action command = " + ae.getActionCommand() + " id = " + ae.getID());
		repaint();
	}



	private class GameKeyListener implements KeyListener
	{
		@Override
		public void keyTyped(KeyEvent ke)
		{

		}

		@Override
		public void keyPressed(KeyEvent ke)
		{
			int keyCode = ke.getKeyCode();
			String keyText = KeyEvent.getKeyText(ke.getKeyCode());
			System.out.println("keyPressed = " + keyText);

			// fighter one move
			if (keyCode == KeyEvent.VK_Z)
			{
				fighterOne.makeMove("LEFT");
			} 
			else if (keyCode == KeyEvent.VK_C)
			{
				fighterOne.makeMove("RIGHT");
			} 
			else if (keyCode == KeyEvent.VK_S)
			{
				fighterOne.makeMove("UP");
			} 
			else if (keyCode == KeyEvent.VK_X)
			{
				fighterOne.makeMove("DOWN");
			} 

			// fighter two move
			if (keyCode == KeyEvent.VK_LEFT)
			{
				fighterTwo.makeMove("LEFT");
			} 
			else if (keyCode == KeyEvent.VK_RIGHT)
			{
				fighterTwo.makeMove("RIGHT");
			} 
			else if (keyCode == KeyEvent.VK_UP)
			{
				fighterTwo.makeMove("UP");
			} 
			else if (keyCode == KeyEvent.VK_DOWN)
			{
				fighterTwo.makeMove("DOWN");
			} 
		}
		
		@Override
		public void keyReleased(KeyEvent ke)
		{
			System.out.println("keyReleased = " + KeyEvent.getKeyText(ke.getKeyCode()));
		}
	}

}