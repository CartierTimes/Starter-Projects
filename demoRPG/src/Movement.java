import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * This class will handle the movement in the game.
 * Moving will also update the events and information
 * regarding what goes in the game
 */
public class Movement implements KeyListener {

    //Status for the certain keys pressed
    public boolean upPressed, downPressed, leftPressed, rightPressed;


    /**
     * This will remain empty because current plans
     * do not require any keys to be typed in game
     * @param e the event to be processed
     */
    @Override
    public void keyTyped(KeyEvent e) {
    }

    /**
     * This handles the event of pressing a key
     * example, pressing downwards on the arrowkey will
     * update the information that a key was pressed (down arrow key)
     * @param e the event to be processed
     */
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP) { //Up arrow key
            upPressed = true;
        }
        if (code == KeyEvent.VK_LEFT) { //Left arrow key
            leftPressed = true;
        }
        if (code == KeyEvent.VK_RIGHT) { //Right arrow key
            rightPressed = true;
        }
        if (code == KeyEvent.VK_DOWN) { //Down arrow key
            downPressed = true;
        }

    }

    /**
     * This handles the event of when the key that's
     * being pressed is released
     * This will reupdate the status of keys back to false.
     * @param e the event to be processed
     */
    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP) { //Up arrow key
            upPressed = false;
        }
        if (code == KeyEvent.VK_LEFT) { //Left arrow key
            leftPressed = false;
        }
        if (code == KeyEvent.VK_RIGHT) { //Right arrow key
            rightPressed = false;
        }
        if (code == KeyEvent.VK_DOWN) { //Down arrow key
            downPressed = false;
        }
    }
}
