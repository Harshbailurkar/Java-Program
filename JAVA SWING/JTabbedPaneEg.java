import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTabbedPaneEg extends JFrame {

    public JTabbedPaneEg() {
        setTitle("Tabbed Pane Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null); // Center the JFrame

        JTabbedPane tabbedPane = new JTabbedPane();

        // Create and add the first tab (Tab1)
        Tab1 tab1 = new Tab1();
        tabbedPane.addTab("Tree Tab", tab1);

        // Create and add the second tab (Tab2)
        Tab2 tab2 = new Tab2();
        tabbedPane.addTab("Table Tab", tab2);

        // Add the tabbedPane to the JFrame
        getContentPane().add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JTabbedPaneEg example = new JTabbedPaneEg();
            example.setVisible(true);
        });
    }

    public class Tab1 extends JPanel {
        Tab1() {
            JTextField Jt = new JTextField(30);
            Jt.setToolTipText("Enter Your Name");
            add(Jt);
            DefaultMutableTreeNode root = new DefaultMutableTreeNode("Countries");
            DefaultMutableTreeNode india = new DefaultMutableTreeNode("India");
            DefaultMutableTreeNode bangladesh = new DefaultMutableTreeNode("Bangladesh");
            DefaultMutableTreeNode maharashtra = new DefaultMutableTreeNode("Maharashtra");
            DefaultMutableTreeNode kolhapur = new DefaultMutableTreeNode("Kolhapur");

            root.add(india);
            root.add(bangladesh);
            india.add(maharashtra);
            maharashtra.add(kolhapur);

            JTree jt = new JTree(root);
            add(jt);
        }
    }

    public class Tab2 extends JPanel {

        Tab2() {
            String cloumn[] = { "name", "Age", "SchoolName" };
            String rows[][] = { { "harsh", "20", "SITCOE" }, { "Rakesh", "18", "AHA" }, { "Sujesh", "19", "AMA" } };

            JTable jt = new JTable(rows, cloumn);
            JScrollPane jsp = new JScrollPane(jt);
            add(jsp);
        }
    }
}
