package com.sysoft;

import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class StreetFighter
{
    public static final int WINDOW_WIDTH = 1000;
    public static final int WINDOW_HEIGHT = 700;
    
    public static void main(String args[])
    {
        HashMap<String, Object> fighterStore = loadFighters();
        // create game board with two fighters
        GameBoard board = new GameBoard((Fighter)fighterStore.get("Ryu"), (Fighter)fighterStore.get("Ken"));

        // open game window
        JFrame gameFrame = new JFrame("Street Fighter");
        gameFrame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        gameFrame.setResizable(false);
        gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //gameFrame.add(board);
        gameFrame.setContentPane(board);
        gameFrame.setVisible(true);
        

    }

    public static HashMap<String, Object> loadFighters()
    {
        HashMap<String, Object> fighterStore = new HashMap<String, Object>();

        try {
            HashMap<String, Object> ryuImageStore = new HashMap<String, Object>();
            //ryuImageStore.put("default", new ImageIcon("image/ryu/ryu-snk-stand.gif").getImage());
            BufferedImage ryuStandImg = ImageIO.read(new File("image/ryu/ryu-snk-stand.gif"));
            ryuImageStore.put("default", ryuStandImg);
            fighterStore.put("Ryu", new Fighter("Ryu", 190, 95, 100, 100, ryuImageStore, WINDOW_WIDTH, WINDOW_HEIGHT, FacingDirection.RIGHT));
    
            HashMap<String, Object> kenImageStore = new HashMap<String, Object>();
            kenImageStore.put("default", new ImageIcon("image/ken/ken-snk-stand.gif").getImage());
            fighterStore.put("Ken", new Fighter("Ken", 190, 95, 100, 100, kenImageStore, WINDOW_WIDTH, WINDOW_HEIGHT, FacingDirection.LEFT));
        } catch (IllegalArgumentException iae) {
            iae.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (NullPointerException npe) {
            npe.printStackTrace();
        }

        return fighterStore;
    }
}