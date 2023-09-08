import java.awt.*;

class ComponentP1 extends Frame {
    TextField t1;
    Label L2;

    ComponentP1() {
        Label l1 = new Label("Your Name:");
        l1.setBounds(30, 80, 80, 20); // Adjusted the Y position
        add(l1);

        t1 = new TextField("Enter your name");
        t1.setBounds(120, 80, 200, 20);
        add(t1);

        Button btn = new Button("Submit");
        btn.setBounds(100, 150, 80, 30);
        btn.setLabel("Harsh");
        add(btn);

        Checkbox ch = new Checkbox("want a food pass?", true);
        ch.setBounds(100, 180, 100, 30);
        add(ch);

        CheckboxGroup chb1 = new CheckboxGroup();
        Checkbox ch1 = new Checkbox("want a food pass?", true, chb1);
        Checkbox ch2 = new Checkbox("want a Disco pass?", false, chb1);
        ch1.setBounds(100, 230, 100, 30);
        ch2.setBounds(100, 270, 100, 30);
        add(ch1);
        add(ch2);

        Choice cho = new Choice();
        cho.add("Orange");
        cho.add("Mango");
        cho.add("papaya");
        cho.setBounds(100, 300, 100, 30);
        add(cho);

        List li1 = new List(2, true);
        li1.add("maths");
        li1.add("science");
        li1.add("Chemisty");
        li1.setBounds(100, 370, 160, 60);
        add(li1);

    }

    public static void main(String[] args) {
        ComponentP1 p1 = new ComponentP1();
        p1.setSize(400, 250); // Adjusted the frame size
        p1.setVisible(true);
        p1.setLayout(null);
        p1.setTitle("Harsh Code Frame");
    }
}
