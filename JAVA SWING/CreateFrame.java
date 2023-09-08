import java.awt.*;
import javax.swing.*;

public class CreateFrame extends JFrame {

    public CreateFrame() {
        Container ct = getContentPane();
        Label l1 = new Label(" Hello Harsh ");
        ct.add(l1);
    }

    public static void main(String[] args) {
        CreateFrame cf = new CreateFrame();
        cf.setSize(400, 400);
        cf.setVisible(true);
        cf.setTitle("Harsh Frame 1");
        cf.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
