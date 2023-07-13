import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class passwordChecker extends JFrame {

    String MYUSERNAME = "abcd";
    String MYPASS = "1234";

    JTextField tx1, tx2;
    JButton check;
    JPanel jp = new JPanel();

    passwordChecker()
    {
        tx1 = new JTextField(20);
        tx2 = new JTextField(20);

        jp.add(new JLabel(" USERNAME "));
        jp.add(tx1);

        jp.add(new JLabel(" PASSWORD "));
        jp.add(tx2);

        check = new JButton(" submit ");
        jp.add(check);

        check.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String uname,pass;
                uname = tx1.getText();
                pass = tx2.getText();

                if(uname.equals(MYUSERNAME) && pass.equals(MYPASS))
                {
                JOptionPane.showMessageDialog(passwordChecker.this, "Success", "Popup Window", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                JOptionPane.showMessageDialog(passwordChecker.this, "FAILED", "Popup Window", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        add(jp);


        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setTitle(" checker ");
        setLocation(200,200);

    
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new passwordChecker();
            }
        });
    }
}
