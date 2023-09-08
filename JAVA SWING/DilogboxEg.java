import java.awt.*;
import javax.swing.*;

public class DilogboxEg extends JDialog {

    public DilogboxEg(JFrame fr, String st) {
        super(fr, st, true);

        Label l1 = new Label("Harsh Bailurkar");
        l1.setBounds(30, 60, 150, 50); // Increase width for label to display text properly
        add(l1);
    }

    public static void main(String[] args) {
        JFrame fr = new JFrame("Main Frame"); // Create a main frame
        DilogboxEg db = new DilogboxEg(fr, "Custom Dialog");
        db.setSize(400, 200); // Set the size of the dialog
        db.setVisible(true);
    }
}
