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

        window.setTitle("Adventures of Jimmy");

    }
}