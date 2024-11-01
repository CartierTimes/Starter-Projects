import javax.swing.JPanel;

public class RPGPanel {

    //Settings for the Screen
    final int originalTileSize = 16; //Keep this unmodified
    final int scale = 3;

    /**
     * The screen size for the game
     * Each of these can be modified to achieve a better resolution (pixels)
     * WARNING: Adjusting it might run the chance of having to
     * adjust other pixels (i.e) Sprites and etc.
     */
    final int tileSize = originalTileSize * scale; //Final tile size on the screen
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;

    //Establishing a proper screen after adjustments
    final int screenWidth = tileSize * maxScreenCol;
    final int screenHeight = tileSize * maxScreenRow;

}