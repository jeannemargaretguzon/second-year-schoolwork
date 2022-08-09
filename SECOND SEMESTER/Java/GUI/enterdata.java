package GUI;

import javax.swing.JOptionPane;

public class enterdata {
    public static void main(String args[]) {
        String name;

        name = JOptionPane.showInputDialog("Enter your name"); // user input
        JOptionPane.showMessageDialog(null, "Hello  " + name, "Welcome Greeting!", JOptionPane.PLAIN_MESSAGE); // when you pressed enter
        System.exit(0);
}
}
