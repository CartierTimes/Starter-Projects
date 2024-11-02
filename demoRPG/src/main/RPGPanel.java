package main;

import entity.Player;

import javax.swing.JPanel;

//For Colour and dimension
import java.awt.*;

public class RPGPanel extends JPanel implements Runnable {

    //Settings for the Screen
    final int originalTileSize = 16; //Keep this unmodified
    final int scale = 3;

    /**
     * The screen size for the game
     * Each of these can be modified to achieve a better resolution (pixels)
     * WARNING: Adjusting it might run the chance of having to
     * adjust other pixels (i.e) Sprites, etc.
     */
    final int tileSize = originalTileSize * scale; //Final tile size on the screen
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;

    //Establishing a proper screen after adjustments
    final int screenWidth = tileSize * maxScreenCol;
    final int screenHeight = tileSize * maxScreenRow;

    //Creating the FPS in the game
    int FPS = 60;

    //Instantiate the movement class
    Movement movement = new Movement();

    //Instantiate the Player
    Player player = new Player(this,movement);


    //Constructor to establish a proper link
    public RPGPanel() {

        //Established the Width and height right here
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));

        //Testing Background
        this.setBackground(Color.black);

        //Buffering.
        this.setDoubleBuffered(true);

        //Game will recognize movement
        this.addKeyListener(movement);

        //Focus on the movement
        this.setFocusable(true);

        //Make sure the panel gets the movement
        this.requestFocusInWindow();
    }

    //This will set the player's home position and speed
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;


    //Timer of frames
    Thread gameThread;

    //Creating this will start the game properly
    public void startGame() {

        //Make sure the panel gets the movement......again
        this.requestFocusInWindow();
        gameThread = new Thread(this);
        gameThread.start(); //This will call the run method
    }

    @Override
    public void run() { //Creates the Threads for the runnable. Updates information in real time

        //Equates to 0.016 second
        double drawInterval = 1000000000/FPS;
        double nextDrawTime = System.nanoTime() + drawInterval;

        while (gameThread != null) {

            //Update Information
            update();

            //Repaint information (Confusing but will make sense)
            repaint();


            try {
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime/1000000;

                if (remainingTime < 0){
                    remainingTime = 0;
                }

                Thread.sleep((long) remainingTime);

                nextDrawTime += drawInterval;

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    //Creating this to update information real time in the game
    public void update() {

        //This case will update the movement for everytime a key is pressed (the arrow keys)
        if (movement.upPressed == true) {
            playerY -= playerSpeed;
        }
        else if (movement.downPressed == true) {
            playerY += playerSpeed;
        }
        else if (movement.rightPressed == true) {
            playerX += playerSpeed;
        }
        else if (movement.leftPressed == true) {
            playerX -= playerSpeed;
        }
    }

    //Made this for the background information -- Graphics
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //Assembling the graphics (Made in 2D)
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.white);
        g2.fillRect(playerX, playerY, tileSize, tileSize);
        g2.dispose(); //This will save memory
    }



}
