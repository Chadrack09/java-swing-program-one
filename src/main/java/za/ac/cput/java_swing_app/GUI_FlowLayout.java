package za.ac.cput.java_swing_app;
/**
 *
 * @author Chadtech
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class GUI_FlowLayout extends JFrame {
  private final JLabel label_one = new JLabel("Title 1");
  private final JButton btn_one = new JButton("Button 1");
  private final JLabel label_two = new JLabel("Title 2");
  private final JButton btn_two = new JButton("Button 2");
  private final JSlider slider = new JSlider(0, 100, 75);
  private final JPanel panel_one = new JPanel(); 
  private final JTabbedPane tabbed_pane = new JTabbedPane();
  
  public GUI_FlowLayout() {
    super();
    this.setSize(720, 720);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new BorderLayout());
    
    panel_one.setBorder(new TitledBorder("My Panel"));
    //components
//    componentsConfig();
    
    //add components
    addComponents();
  }
  
  private void componentsConfig(){
    // label_one.setSize(100, 100);
    // btn_one.setBounds(100, 0, 100, 25);
    // label_two.setBounds(0, 30, 100, 25);
    // btn_two.setBounds(100, 30, 100, 25);
  }
  private void addComponents(){
    //main frame adding
    this.add(label_one, BorderLayout.NORTH);
    this.add(btn_one, BorderLayout.CENTER);
    this.add(label_two, BorderLayout.SOUTH);
    this.add(btn_two, BorderLayout.WEST);
    this.add(panel_one);
    this.add(tabbed_pane);
           
    //else components adding
    panel_one.add(slider);
    tabbed_pane.addTab("Tab 1", new JLabel("Label 1"));
    tabbed_pane.addTab("Tab 2", new JLabel("Label 2"));
    
  }
  
  public static void main(String[] args) {
    new GUI_FlowLayout();
  }
}
