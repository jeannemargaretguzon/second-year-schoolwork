package GUI; // remove if outside of the GUI folder

import javax.swing.JOptionPane;

public class errordisplay {
    public static void main(String args[]){
        {
            JOptionPane.showMessageDialog(null, "An error occured!", "Error Message", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
}
