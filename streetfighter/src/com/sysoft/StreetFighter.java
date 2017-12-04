package com.sysoft;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class StreetFighter
{
    public static final int WINDOW_WIDTH = 1000;
    public static final int WINDOW_HEIGHT = 600;
    
    public static void main(String args[])
    {

        // crate fighter one
        HashMap<String, Object> ryuImageStore = new HashMap<String, Object>();
        ryuImageStore.put("default", new ImageIcon("image/ryu/ryu-snk-stand.gif").getImage());
        Fighter fone = new Fighter("Ryu", 190, 95, 100, 100, ryuImageStore, 100, 400, WINDOW_WIDTH, WINDOW_HEIGHT, FacingDirection.RIGHT);

        // crate fighter two
        HashMap<String, Object> kenImageStore = new HashMap<String, Object>();
        kenImageStore.put("default", new ImageIcon("image/ken/ken-snk-stand.gif").getImage());
        Fighter ftwo = new Fighter("Ken", 190, 95, 100, 100, kenImageStore, 700, 400, WINDOW_WIDTH, WINDOW_HEIGHT, FacingDirection.LEFT);

        // create game board with two fighters
        GameBoard board = new GameBoard(fone, ftwo);

        // open game window
        JFrame gameFrame = new JFrame("Street Fighter");
        gameFrame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        gameFrame.setResizable(false);
        gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //gameFrame.add(board);
        gameFrame.setContentPane(board);
        gameFrame.setVisible(true);
        

    }
}