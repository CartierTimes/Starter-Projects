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


    //Constructor to establish a proper link
    public RPGPanel() {

        //Established the Width and height right here
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        //Testing Background
        this.setBackground(Color.black);
        //Buffering.
        this.setDoubleBuffered(true);
    }

    //Timer of frames
    Thread gameThread;
    //Creating this will start the game properly
    public void startGame() {
        gameThread = new Thread(this);
        gameThread.start(); //This will call the run method
    }

    @Override
    public void run() { //Creates the Threads for the runnable
    
    }
}
