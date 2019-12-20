import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class myAction3 extends JFrame implements ActionListener {
 public JFrame myFrame;
 public JButton myButton;
 public JTextField myText1;
 public JButton myButton2;
 public JButton myButton3;
 public static void main(String[] args) {
  new myAction3(); 
 }
 public myAction3() { 
  myFrame = new JFrame(" Окно");
  myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  myButton = new JButton(" 1"); 
  myButton2 = new JButton(" 2");
  myButton3 = new JButton(" 3");
  myText1 = new JTextField();
  JPanel myPanel = new JPanel();
  myPanel.add(myButton);
  myPanel.add(myButton2);
  myPanel.add(myButton3);
  myButton.addActionListener(this); 
  myButton2.addActionListener(this);
  myButton3.addActionListener(this);
  myFrame.add(myText1, BorderLayout.NORTH);
  myFrame.add(myPanel, BorderLayout.CENTER);
  myFrame.pack();
  myFrame.setMinimumSize(myFrame.getSize());
  myFrame.setVisible(true);
 }
 public void actionPerformed(ActionEvent e) {
  myText1.setText(e.getActionCommand());
 }}