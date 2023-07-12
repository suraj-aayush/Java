import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Checkbox2 extends JFrame implements ItemListener {
    JCheckBox b1, b2, b3;
    JLabel one, two;

    Checkbox2() {
        b1 = new JCheckBox("Moblie ");
        b2 = new JCheckBox("Tablet");
        b3 = new JCheckBox("Laptop");

        one = new JLabel("Choose the Device");
        two = new JLabel(" ");

        b1.addItemListener(this);
        b2.addItemListener(this);
        b3.addItemListener(this);

        add(b1);
        add(b2);
        add(b3);
        add(one);
        add(two);

        setSize(300, 400);
        setLayout(new FlowLayout(FlowLayout.CENTER, 150, 10));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void itemStateChanged(ItemEvent e){
        if(e.getItemSelectable()==b1)
        {
            two.setText(two.getText() + " " +b1.getText());
        }
        else if(e.getItemSelectable()==b2)
        {
            two.setText(two.getText()+" "+b2.getText());
        }
        else if(e.getItemSelectable()==b3)
        {
            two.setText(two.getText()+ "  " +b3.getText());
        }
        if(e.getStateChange() == ItemEvent.DESELECTED)
        {
            two.setText(" ");;
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new Checkbox2();
            }
        });
    }
}
