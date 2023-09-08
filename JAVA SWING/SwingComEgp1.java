import javax.swing.*;
import java.awt.*;

public class SwingComEgp1 extends JFrame {

    public SwingComEgp1() {
        Container ct = getContentPane();
        ct.setLayout(null); // Set layout manager to null for absolute positioning

        // Labels
        JLabel l1 = new JLabel("Name:");
        l1.setBounds(30, 60, 50, 40);
        JLabel l2 = new JLabel("Address:");
        l2.setBounds(30, 160, 70, 30);

        // Text Fields
        JTextField t1 = new JTextField("Enter your name");
        t1.setBounds(100, 60, 150, 30);

        // Text Area
        JTextArea ta = new JTextArea("Enter the address", 5, 20);
        ta.setBounds(100, 160, 200, 100);

        // Button
        JButton jb = new JButton("Save Info");
        jb.setBounds(30, 280, 100, 30);

        // Checkbox
        JCheckBox chb = new JCheckBox("Agreed to terms and conditions");
        chb.setBounds(30, 320, 250, 30);

        // Radio Buttons
        JRadioButton mrd = new JRadioButton("Male");
        JRadioButton frd = new JRadioButton("Female");
        mrd.setBounds(30, 360, 80, 30);
        frd.setBounds(120, 360, 80, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(mrd);
        bg.add(frd);

        // ComboBox
        String[] items = { "Orange", "Mango", "Cake" };
        JComboBox<String> jcb = new JComboBox<>(items);
        jcb.setBounds(30, 400, 100, 30);

        // Image
        ImageIcon img = new ImageIcon("image.png");
        JLabel l3 = new JLabel(img);
        l3.setBounds(400, 30, img.getIconWidth(), img.getIconHeight());

        // Add components to the container
        ct.add(l1);
        ct.add(t1);
        ct.add(l2);
        ct.add(ta);
        ct.add(jb);
        ct.add(chb);
        ct.add(mrd);
        ct.add(frd);
        ct.add(jcb);
        ct.add(l3);
    }

    public static void main(String[] args) {
        SwingComEgp1 sc = new SwingComEgp1();
        sc.setSize(400, 500);
        sc.setVisible(true);
        sc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
