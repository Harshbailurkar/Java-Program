import java.awt.*;

public class BorderLayoutEg extends Frame {

    BorderLayoutEg() {
        BorderLayout fl = new BorderLayout(20, 20);
        setVisible(true);
        setSize(400, 400);
        setLayout(fl);
        Button b = new Button("Save");
        Button b1 = new Button("Save1");
        Button b2 = new Button("Save2");
        Button b3 = new Button("Save3");
        Button b4 = new Button("Save4");
        add(b, BorderLayout.CENTER);
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
    }

    public static void main(String[] args) {
        new BorderLayoutEg();
    }
}