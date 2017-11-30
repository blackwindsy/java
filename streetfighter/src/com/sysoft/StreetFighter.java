package com.sysoft;

import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class StreetFighter
{
    public static void main(String args[])
    {

        GameBoard board = new GameBoard();
        JFrame gameFrame = new JFrame("Street Fighter");
        gameFrame.add(board);
        gameFrame.setSize(1000, 800);
        gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameFrame.setVisible(true);


    }
}