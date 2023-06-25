
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBox extends JFrame implements ItemListener {
    JPanel p;
    JCheckBox[] weekbox;
    JLabel one;

    CheckBox() {
        p = new JPanel();
        p.setLayout(new GridLayout(4, 2, 5, 5));

        one = new JLabel("Select the day");

        String[] week = { "Sunday", "Monday", "Tesuday", "Wednesday", "Thursday", "Friday", "Saturday" };
        weekbox = new JCheckBox[week.length];
        for (int i = 0; i < 7; i++) {
            weekbox[i] = new JCheckBox(week[i]);
            weekbox[i].addItemListener(this);
            p.add(weekbox[i]);
        }

        p.add(one);

        add(p);
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent a) {
        String day = "Today is ";
        for (JCheckBox w : weekbox) {
            if (w.isSelected()) {
                day += w.getText();
            }
        }
        one.setText(day);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CheckBox();
            }
        });
    }
}
