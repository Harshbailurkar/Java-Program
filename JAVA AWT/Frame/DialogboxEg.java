import java.awt.*;

public class DialogboxEg extends Dialog {

    public DialogboxEg(Frame fr, String st) {
        super(fr, st, true);

        Label l1 = new Label("Harsh Bailurkar");
        l1.setBounds(30, 60, 150, 50); // Increase width for label to display text properly
        add(l1);
    }

    public static void main(String[] args) {
        Frame fr = new Frame("Main Frame"); // Create a main frame
        DialogboxEg db = new DialogboxEg(fr, "Custom Dialog");
        db.setSize(400, 200); // Set the size of the dialog
        db.setVisible(true);
    }
}
