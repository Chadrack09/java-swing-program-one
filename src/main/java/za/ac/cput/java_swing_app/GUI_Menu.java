package za.ac.cput.java_swing_app;

import javax.swing.JFrame;
import javax.swing.*;
/**
 * @author Chadtech
 * Date modified 2021-05-02
 * @version 1.1
 */
public class GUI_Menu {
  public GUI_Menu() {
    JFrame frame = new JFrame("Menu List");
    JMenuBar menuBar = new JMenuBar();
    
    JMenu file = new JMenu("File");
    JMenu edit = new JMenu("Edit");
    
    JMenuItem open_file = new JMenu("Open File");
    JMenuItem save = new JMenu("Save");
    JMenuItem save_as = new JMenu("Save as");
    JCheckBoxMenuItem cut = new JCheckBoxMenuItem("Cut");
    JMenuItem copy = new JMenuItem("Copy");
    JMenuItem paste = new JMenuItem("Paste");
    JMenuItem select_all = new JMenuItem("Select All");
    
    menuBar.add(file);
    menuBar.add(edit);
    file.add(open_file);
    file.add(save);
    file.add(save_as);
    edit.add(cut);
    edit.add(copy);
    edit.add(paste);
    edit.add(select_all);
    
    
    frame.setJMenuBar(menuBar);
    frame.setSize(720, 720);
    frame.setVisible(true);
    frame.setLayout(null);
  }
  
  public static void main(String[] args) {
    GUI_Menu main = new GUI_Menu();
  }
}
