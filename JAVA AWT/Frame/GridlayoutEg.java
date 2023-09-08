import java.awt.*;

public class GridlayoutEg extends Frame {

    GridlayoutEg() {
        GridLayout fl = new GridLayout(1, 4, 12, 12);
        setSize(400, 400);
        setVisible(true);
        setLayout(fl);
        Button b = new Button("Save");
        Button b1 = new Button("Save1");
        Button b2 = new Button("Save2");
        add(b);
        add(b1);
        add(b2);
    }

    public static void main(String[] args) {
        new GridlayoutEg();
    }
}