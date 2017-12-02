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

	public GameBoard()
	{
	}

	public GameBoard(Fighter fone, Fighter ftwo)
	{
		fighterOne = fone;
		fighterTwo = ftwo;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		// makes the borders of the figures smoother
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g2d.fillOval(10, 20, 15, 15);
		g2d.drawImage(fighterOne.getImage(), 100, 200, null);
		g2d.drawImage(fighterTwo.getImage(), 500, 200, null);
	}

}