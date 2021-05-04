package swing_app;
/**
 *
 * @author Chadtech
 * 2021-05-03
 * this is a small windows app built using java swing
 * to illustrate understanding on java swing
 */
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class WindowApp extends JFrame {
  private final JPanel mainPanel_one = new JPanel();
  private final JPanel panel_one_one = new JPanel();
  private final JPanel panel_one_two = new JPanel();
  private final JPanel mainPanel_two = new JPanel();
  private final JPanel panel_two_one = new JPanel();
  private final JPanel panel_two_two = new JPanel();
  private final JMenuBar menu_bar = new JMenuBar();
  private final JMenu menu_one = new JMenu("File");
  private final JMenu menu_two = new JMenu("Edit");
  
  String[] languages = {"Java", "C#", "Python", "PHP", "Ruby"};
  private final JList<String> item_lists = new JList<>(languages);
  
  public WindowApp() {
    super();
    this.setSize(720, 720);
    this.setLayout(new GridLayout(1, 2));
    this.setVisible(rootPaneCheckingEnabled);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // adding components
    addComponents();
    
    //config components
    config();
  }
  
  //adding components
  private void addComponents(){
    this.setJMenuBar(menu_bar);
    this.add(mainPanel_one);
    this.add(mainPanel_two);
    menu_bar.add(menu_one);
    menu_bar.add(menu_two);
    
    mainPanel_one.add(panel_one_one);
    mainPanel_one.add(panel_one_two); 
    mainPanel_two.add(panel_two_one);
    mainPanel_two.add(panel_two_two);
    
    panel_one_one.add(item_lists);
  }
  
  private void config(){
    mainPanel_one.setLayout(new GridLayout(2, 1));
    mainPanel_two.setLayout(new GridLayout(2, 1));
    
    mainPanel_one.setBorder(new TitledBorder("Main Panel One"));
    panel_one_one.setBorder(new TitledBorder("Panel one"));
    panel_one_two.setBorder(new TitledBorder("Panel two"));
    
    mainPanel_two.setBorder(new TitledBorder("Main Panel Two"));
    panel_two_one.setBorder(new TitledBorder("Panel one"));
    panel_two_two.setBorder(new TitledBorder("Panel two"));
  }
  
  public static void main(String[] args) {
    WindowApp window = new WindowApp();
  }
}
