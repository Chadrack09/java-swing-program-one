package za.ac.cput.java_swing_app;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.awt.event.ItemEvent;
// import java.awt.event.ItemListener;
import javax.swing.*;
/**
 *
 * @author Chadtech
 * 2021-05-02
 * Cape Peninsula University Of Technology
 */
public class GUI_Components {
  // Object general method
  public GUI_Components() {
    JFrame frame = new JFrame("Check-Radio-Combo-Box");
    JLabel label_header = new JLabel("Java Swing Boxes");
    JCheckBox checkbox_one = new JCheckBox("Java");
    JCheckBox checkbox_two = new JCheckBox("C#");
    JCheckBox checkbox_three = new JCheckBox("PHP");
    JLabel label_java = new JLabel("Java: ");
    JLabel label_cs = new JLabel("C#: ");
    JLabel label_php = new JLabel("PHP: ");
    JRadioButton r_btn_one = new JRadioButton("Male");
    JRadioButton r_btn_two = new JRadioButton("Female");
    JButton btn_radio = new JButton("Check");
    ButtonGroup btn_group = new ButtonGroup();
    Font font_ = new Font("Lato", Font.BOLD, 16);
    
    //Java Swing List
    DefaultListModel<String> list = new DefaultListModel<>();
    list.add(0, "Item 1");
    list.add(1, "Item 2");
    list.add(2, "Item 3");
    list.add(3, "Item 4");
    
    JList<String> list_items = new JList<>(list);
    
    
    // Java Combo Boxes
    String languages[] = {"C#", "Java", "PHP", "Python", "JavaScript"};
    JComboBox combo_box = new JComboBox(languages);
    
    frame.setSize(720, 720);
    frame.setVisible(true);
    frame.setLayout(null);
    frame.setFont(font_);
    
    frame.add(label_header);
    frame.add(checkbox_one);
    frame.add(checkbox_two);
    frame.add(checkbox_three);
    frame.add(label_java);
    frame.add(label_cs);
    frame.add(label_php);
    frame.add(r_btn_one);
    frame.add(r_btn_two);
    frame.add(btn_radio);
    btn_group.add(r_btn_one);
    btn_group.add(r_btn_two);
    frame.add(combo_box);
    frame.add(list_items);
    
    // frame window listener
    frame.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e){
        System.exit(0);
      }
    });
    
    label_header.setBounds(0, 0, 200, 25);
    checkbox_one.setBounds(0, 30, 100, 25);
    checkbox_two.setBounds(0, 60, 100, 25);
    checkbox_three.setBounds(0, 90, 100, 25);
    label_java.setBounds(0, 115, 100, 25);
    label_cs.setBounds(0, 135, 100, 25);
    label_php.setBounds(0, 160, 100, 25);
    r_btn_one.setBounds(0, 190, 100, 25);
    r_btn_two.setBounds(100, 190, 100, 25);
    btn_radio.setBounds(0, 220, 100, 25);
    btn_radio.setFont(font_);
    btn_radio.setBackground(Color.red);
    btn_radio.setForeground(Color.white);
    combo_box.setBounds(0, 250, 200, 25);
    list_items.setBounds(0, 300, 100, 100);
    
    //Combo Box Item Listener
    combo_box.addItemListener(new ItemListener() {
      @Override
      public void itemStateChanged(ItemEvent e) {
        String combo_element = String.valueOf(combo_box.getItemAt(combo_box.getSelectedIndex()));
        JLabel label = new JLabel();
        label.setBounds(0, 280, 200, 25);
        label.setText("You choose: " +combo_element);
      }
    });
    
    // Radio button action listener
    btn_radio.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        if(r_btn_one.isSelected()){
          JOptionPane.showMessageDialog(null, "You are male");
        }
        if(r_btn_two.isSelected()){
          JOptionPane.showMessageDialog(null, "You are female");
        }
      }
    });
    
    //item listener
    checkbox_one.addItemListener(new ItemListener() {
      @Override
      public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == 1){
          label_java.setText("Java: Checked");
        }else {
          label_java.setText("Java: Unchecked");
        }
      }
    });
    checkbox_two.addItemListener(new ItemListener() {
      @Override
      public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == 1){
          label_cs.setText("C#: Checked");
        }else label_cs.setText("C#: Unchecked");
      }
    });
    checkbox_three.addItemListener(new ItemListener() {
      @Override
      public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == 1){
          label_php.setText("PHP: Checked");
        }else label_php.setText("PHP: Unchecked");
      }
    });
  } 
  
  public static void main(String[] args) {
    GUI_Components gui_Components = new GUI_Components();
  }
}
