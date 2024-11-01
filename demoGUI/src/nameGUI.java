import javax.swing.JOptionPane;

/**
 * Testing GUI using description about yourself.
 * Will ask your Name, Age, and Height in CM.
 * Currently basic but will add more later
 */
public class nameGUI {
    public static void main(String[] args) {
        //Lines here for inputting your Name ---
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        //Lines here for your age ---
        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
        JOptionPane.showMessageDialog(null, "Your age is " + age);

        //Lines here for height
        double height = Integer.parseInt(JOptionPane.showInputDialog("What is your height in cm?"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm");

        //Lines Here will show your description about yourself
        JOptionPane.showMessageDialog(null, "Name: " +name + "\n" + "Age: " + age +
                "\n" + "Height: " + height);
        }

    }
