import javax.swing.*;
import java.awt.*;

 class swingDemo
{
    swingDemo()
    {
        //  CREATING FRAME
        JFrame jfr = new JFrame("MY APP");

        //creating buttons
        JButton buttonsave, buttonexit;
        buttonsave = new JButton(" S A V E ");
        buttonexit = new JButton(" E X I T ");

        //CREATING JLABEL
        JLabel jlab = new JLabel("GUI ");

        jfr.setLayout(new FlowLayout());

        // ADDING COMPONENTS TO JFRAME
        jfr.add(jlab);
        jfr.add(buttonsave);
        jfr.add(buttonexit);

        // SET THE SIZE
        jfr.setSize(500,300);

        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jfr.setVisible(true);

    }
}

public class first
{
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new swingDemo();
            }
        });
    }
}