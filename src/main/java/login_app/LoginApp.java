package login_app;

import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.awt.GridLayout;
/**
 * @author Chadtech
 * 2021-05-04
 */
public class LoginApp extends JFrame implements ActionListener {
  private final JLabel label_usename = new JLabel("Username: ");
  private final JTextField input_username = new JTextField();
  private final JLabel label_password = new JLabel("Password: ");
  private final JTextField input_password = new JTextField();
  private final JButton btn_login = new JButton("Login");
  private final JButton btn_exit = new JButton("Exit");
  private final Font font = new Font("Roboto", NORMAL, 14);
  
  public LoginApp() {
    super();
    this.setSize(572, 150);
    this.setLayout(new GridLayout(3, 2));
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //calling addComponents Methods
    addComponents();
    
    //calling config method
    config();
  }
  
  //methods to add components
  private void addComponents(){
    this.add(label_usename);
    this.add(input_username);
    this.add(label_password);
    this.add(input_password);
    this.add(btn_login);
    this.add(btn_exit);
    
    btn_login.addActionListener(this);
    btn_exit.addActionListener(this);
  }
  
  private void config() {
    label_usename.setFont(font);
  }
  
  @Override
  public void actionPerformed(ActionEvent e) {
    if(e.getActionCommand().equals("Login")){
      String username = input_username.getText();
      String password = input_password.getText();
      
      if(username.equals("Chadrack") && password.equals("123")){
        JOptionPane.showMessageDialog(null, "Logged in successfully");
      }else JOptionPane.showMessageDialog(null, "Error login");
    }
    else if(e.getActionCommand().equals("Exit")){
      System.exit(0);
    }
  }

  public static void main(String[] args) {
    LoginApp loginApp = new LoginApp();
  }
}



















