package com.sysoft;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GameBoard extends JPanel
{
	Fighter fighterOne;
	Fighter fighterTwo;
	Image fighterOneImage;
	Image fighterTwoImage;

	public GameBoard()
	{
	}

	public GameBoard(Fighter fone, Fighter ftwo)
	{
		fighterOne = fone;
		fighterTwo = ftwo;
		fighterOneImage = fone.getImage();
		fighterTwoImage = ftwo.getImage();
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		// makes the borders of the figures smoother
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.drawImage(fighterOne.getImage(), fighterOne.getLocationX(), fighterOne.getLocationY(), null);
		g2d.drawImage(fighterTwo.getImage(), fighterTwo.getLocationX(), fighterTwo.getLocationY(), null);
	}

}