
import java.awt.event.*;
import javax.swing.*;

public class ItemListenerEventEg extends JFrame implements ItemListener {
    JLabel l1;
    JCheckBox ch1;

    ItemListenerEventEg() {
        l1 = new JLabel();
        l1.setBounds(150, 50, 200, 50);

        ch1 = new JCheckBox("Do you want FoodPass?");
        ch1.setBounds(30, 100, 200, 100);
        ch1.addItemListener(this);

        add(l1);
        add(ch1);

        // Set JFrame properties
        setSize(400, 500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie) {
        if (ie.getStateChange() == ItemEvent.SELECTED) {
            l1.setText("Want a Food Pass");
        } else {
            l1.setText("");
        }
    }

    public static void main(String[] args) {
        new ItemListenerEventEg();
    }
}
