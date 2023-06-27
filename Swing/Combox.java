import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Combox extends JFrame implements ItemListener{
    JPanel p;
    JComboBox weekbox;
    JLabel one;
    Combox(){
        p= new JPanel();
        one = new JLabel("Select the day");
        String[] week = {"Monday","Tuesday","Wednesday","Thusday","Friday","Saturday","Sunday"};

        weekbox = new JComboBox<>(week);
        weekbox.addItemListener(this);

        p.add(weekbox);
        p.add(one);

        add(p);

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void itemStateChanged(ItemEvent e)
    {
        String day = "Today is " + weekbox.getSelectedItem();

        one.setText(day);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                new Combox();
            }
        });
    }
}
