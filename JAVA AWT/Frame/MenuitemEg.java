import java.awt.*;

public class MenuitemEg extends Frame {

    MenuitemEg() {

        MenuBar mb = new MenuBar();

        Menu m = new Menu("File");
        Menu m1 = new Menu("Open");
        MenuItem mi11 = new MenuItem("Folder");
        MenuItem mi12 = new MenuItem("File");
        MenuItem mi2 = new MenuItem("Close");
        m.add(m1);
        m1.add(mi11);
        m1.add(mi12);
        m.add(mi2);
        mb.add(m);
        Menu m2 = new Menu("Edit");
        MenuItem mi3 = new MenuItem("Copy");
        m2.add(mi3);
        mb.add(m2);

        setMenuBar(mb);
    }

    public static void main(String[] args) {
        MenuitemEg mi = new MenuitemEg();
        mi.setSize(400, 400);
        mi.setVisible(true);
        mi.setLayout(null);
    }
}
