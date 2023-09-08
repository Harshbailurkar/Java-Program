import java.awt.*;

public class FontColorEg extends Frame {

    FontColorEg() {
        Label l1 = new Label();
        l1.setText("Harsh Bailurkar");
        l1.setBackground(Color.RED);
        l1.setForeground(Color.WHITE);
        add(l1);
        Font f = new Font("Times New Roman", Font.BOLD, 20);
        l1.setFont(f);
    }

    public static void main(String[] args) {
        FontColorEg fc = new FontColorEg();
        fc.setSize(400, 400);
        fc.setVisible(true);
        fc.setLayout(null);
        fc.setTitle("harsh fram3");
        fc.setBackground(Color.BLUE);
    }
}