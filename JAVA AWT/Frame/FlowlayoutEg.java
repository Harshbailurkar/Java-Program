import java.awt.*;

public class FlowlayoutEg extends Frame {

    FlowlayoutEg() {
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        setSize(400, 400);
        setVisible(true);
        setLayout(fl);
        Button b = new Button("Save");
        add(b);
    }

    public static void main(String[] args) {
        new FlowlayoutEg();
    }
}