import javax.swing.JFrame;


/**
 * Building a classic RPG game here will classic movements and interactions
 * Barebones currently but will implement basic combat and others later
 */
public class MainRPG {

    //Inside the main here will establish the first connection in building this
    public static void main(String[] args) {

        JFrame window = new JFrame();

        //This here will make sure the program properly closes when clicking the x
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //This to keep the game on one size
        window.setResizable(false);

        //Title of the game
        window.setTitle("Adventures of Jimbo");

        //Clause to make sure the game will be visible
        window.setVisible(true);

        //Making the game screen here
        RPGPanel panel = new RPGPanel();

        //Adding it to the window
        window.add(panel);

        //This will keep it to the size as constructed (See RPGPanel.class for more details)
        window.pack();

        //Set this so the screen will be at the middle (NOTE: Will develop fullscreen later)
        window.setLocationRelativeTo(null);
    }
}