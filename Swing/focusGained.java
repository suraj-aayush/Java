import javax.swing.*;
import java.awt.event.*;

class TextEventDemo extends JFrame implements ActionListener, FocusListener {
    JTextField txone, txtwo; // Text Fields
    JPanel p;// Panel to hold the components
    JLabel lone, ltwo;// Labels

    TextEventDemo()// Constructor
    {
        p = new JPanel();
        lone = new JLabel(" Focus ");// Labels
        ltwo = new JLabel(" Action ");
        // Create Text Fields
        txone = new JTextField(10);
        txtwo = new JTextField(10);
        // Register the textfields to listen to events
        txone.addFocusListener(this);
        txtwo.addActionListener(this);
        // Add components to Panel
        p.add(txone);
        p.add(lone);
        p.add(txtwo);
        p.add(ltwo);
        add(p);// Add Panel to Frame (this)
        setVisible(true);
    }// Constructor closed
     // Catch the Event Object and Process
     // FocusListener first

    public void focusGained(FocusEvent fe) {
        lone.setText("Focus Gained");// Change Label text
    }

    public void focusLost(FocusEvent fe) {
        lone.setText("Focus Lost"); // Change Label text
    }

    // ActionerListener next
    public void actionPerformed(ActionEvent ae) {
        String message;
        message = txtwo.getText(); // Extract text
        ltwo.setText(message); // Set text to label
    }// End of actionPerformed method
}// End of class TextEventDemo
 // Class Demo has main method. Create the object of TextEventDemo

public class focusGained {
    public static void main(String[] args) {
        try
        {
            javax.swing.SwingUtilities.invokeAndWait(
                new Runnable()
                {
                    public void run()
                    {
                        TextEventDemo ademo=new TextEventDemo();
                        ademo.setSize(450, 150); 
                        ademo.setVisible(true);
                        ademo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                }
            );
        }
        catch(Exception e)
        {
            System.err.println("Error");
        }
    }
}
