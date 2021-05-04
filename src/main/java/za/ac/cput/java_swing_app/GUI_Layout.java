package za.ac.cput.java_swing_app;
/**
 *
 * @author Chadtech
 */
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;

public class GUI_Layout {
  private final JFrame frame = new JFrame("Window Layout");
  private final JButton button_up = new JButton("Up");
  private final JButton button_down = new JButton("Down");
  private JButton button_left = new JButton("Left");
  private JButton button_right = new JButton("Right");
  private JButton button_center = new JButton("Center");
  private JPanel panel = new JPanel();
  
  public GUI_Layout(){
    
    frame.setSize(720, 720);
    frame.setVisible(true);
    // frame.setLayout(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel);
    
    panel.setLayout(new BorderLayout());
    panel.add(button_up, BorderLayout.NORTH);
    panel.add(button_down, BorderLayout.SOUTH);
    panel.add(button_left, BorderLayout.EAST);
    panel.add(button_right, BorderLayout.WEST);
    panel.add(button_center, BorderLayout.CENTER);
  }
  
  public static void main(String[] args) {
    new GUI_Layout();
  }
}
