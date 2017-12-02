package com.sysoft;

import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;

public class StreetFighter
{
    public static void main(String args[])
    {

        // crate fighter one
        ImageIcon ryuImage = new ImageIcon("image/ryu/ryu-snk-stand.gif");
        Fighter fone = new Fighter("Ryu", 190, 95, 100, 100, ryuImage);

        // crate fighter two
        ImageIcon kenImage = new ImageIcon("image/ken/ken-snk-stand.gif");
        Fighter ftwo = new Fighter("Ken", 190, 95, 100, 100, kenImage);

        // create game board with two fighters
        GameBoard board = new GameBoard(fone, ftwo);

        // open game window
        JFrame gameFrame = new JFrame("Street Fighter");
        gameFrame.add(board);
        gameFrame.setSize(1000, 800);
        gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameFrame.setVisible(true);


    }
}