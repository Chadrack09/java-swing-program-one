package za.ac.cput.java_swing_app;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Chadtech
 * 2021-05-02
 * Cape Peninsula University Of Technology
 */
public class GUI_Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("New Window");
    JLabel label_one = new JLabel("Java Swing Learning");
    JTextField input_one = new JTextField();
    JTextField input_two = new JTextField();
    JTextField input_three = new JTextField("Result");
    JButton btn_one = new JButton("Add");
    JButton btn_two = new JButton("Substract");
    JLabel label_area_one = new JLabel("Words:");
    JLabel label_area_two = new JLabel("Characters:");
    JButton btn_count = new JButton("Count");
    JLabel label_user_details = new JLabel("User Details");
    JTextField user_textfield = new JTextField();
    JPasswordField user_password = new JPasswordField();
    JLabel label_username = new JLabel("Username");
    JLabel label_password = new JLabel("Password ");
    JLabel label_username_one = new JLabel("Username");
    JLabel label_password_one = new JLabel("Password");
    JButton btn_login = new JButton("Login");  
    JTextArea text_area = new JTextArea();
    
    //add to frame components
    frame.add(label_one);
    frame.add(input_one);
    frame.add(input_two);
    frame.add(input_three);
    frame.add(btn_one);
    frame.add(btn_two);
    frame.add(label_area_one);
    frame.add(label_area_two);
    frame.add(text_area);
    frame.add(btn_count);
    frame.add(label_user_details);
    frame.add(label_username);
    frame.add(label_username_one);
    frame.add(label_password);
    frame.add(label_password_one);
    frame.add(user_textfield);
    frame.add(user_password);
    frame.add(btn_login);
    
    
    //frame props
    frame.setSize(720, 720);
    frame.setLayout(null);
    frame.setVisible(true);
    
    // components calculator
    label_one.setBounds(0, 0, 150, 25);
    input_one.setBounds(0, 25, 220, 25);
    input_two.setBounds(0, 50, 220, 25);
    input_three.setBounds(0, 75, 220, 25);
    input_three.setEditable(false);
    btn_one.setBounds(0, 100, 100, 25);
    btn_two.setBounds(120, 100, 100, 25);
    
    //components text area
    label_area_one.setBounds(0, 150, 100, 25);
    label_area_two.setBounds(120, 150, 100, 25);
    text_area.setBounds(0, 176, 220, 220);
    btn_count.setBounds(0, Math.addExact(185, 220), 100, 25);
    
    //components user details
    label_user_details.setBounds(0, 455, 100, 25);
    label_username.setBounds(0, 480, 100, 25);
    user_textfield.setBounds(100, 480, 220, 25);
    label_password.setBounds(0, 480+25, 100, 25);
    user_password.setBounds(100, 480+25, 220, 25);
    btn_login.setBounds(100, 530, 100, 25);
    
    
    // button add action listener
    btn_one.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if(input_one.getText() != null && input_two.getText() != null){
          String text_one = input_one.getText();
          String text_two = input_two.getText();

          int result = 0;
          int number_one = Integer.parseInt(text_one);
          int number_two = Integer.parseInt(text_two);

          result = number_one + number_two;
          String result_ = String.valueOf(result);
          input_three.setText(result_);
        }
      }
    });
    
    // button substract action listener
    btn_two.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if(input_one.getText() != null && input_two.getText() != null){
          String text_one = input_one.getText();
          String text_two = input_two.getText();

          int result = 0;
          int number_one = Integer.parseInt(text_one);
          int number_two = Integer.parseInt(text_two);
          result = number_one - number_two;

          String result_ = String.valueOf(result);
          input_three.setText(result_);
        }
      }
    });
    
    //btn_count words and characters
    btn_count.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String characters = text_area.getText();
        String word[] = characters.split("\\s");
        
        label_area_one.setText("Words: " +word.length);
        label_area_two.setText("Characters: " +characters.length());
      }
    });
  }
}
