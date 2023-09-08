
import javax.swing.*;
import java.awt.event.*;

public class ActionEventEg extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton b1;

    ActionEventEg() {
        l1 = new JLabel();
        l1.setBounds(150, 50, 100, 50);
        l2 = new JLabel("Enter a number");
        l2.setBounds(30, 130, 100, 40);
        t1 = new JTextField();
        t1.setBounds(30, 190, 100, 40);
        l3 = new JLabel("Enter a number");
        l3.setBounds(30, 250, 100, 40);
        t2 = new JTextField();
        t2.setBounds(30, 310, 100, 40);
        b1 = new JButton("ADD");
        b1.setBounds(30, 370, 100, 30);

        b1.addActionListener(this);

        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(b1);

        // Set JFrame properties
        setSize(400, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); // Display the JFrame
    }

    public void actionPerformed(ActionEvent ae) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = a + b;
        l1.setText("addition is " + c);

    }

    public static void main(String[] args) {
        new ActionEventEg();
    }
}