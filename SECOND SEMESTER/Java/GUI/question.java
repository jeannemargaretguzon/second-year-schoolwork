package GUI; // remove if outside of the GUI folder

import javax.swing.JOptionPane;

public class question {
    public static void main(String args[]){
        {
            JOptionPane.showMessageDialog(null, "Continue the process?", "Question", JOptionPane.QUESTION_MESSAGE);
            System.exit(0);
        }
    }
}

