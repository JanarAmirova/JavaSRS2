import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
public class MyFrame {
 public static void main(String[] args) {
  JFrame frame = new JFrame(" FrameDemo"); 
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(500, 400);
  JPanel myPanel1 = new JPanel(); 
  myPanel1.setLayout(new FlowLayout()); 
  myPanel1.add(new JButton(" Кнопка 1")); 
  JButton myButton2 = new JButton("<html><b><font color=\"red\"size=14>Кнопка2</font></b></html>");
   Component horizontalStrut =
   Box.createHorizontalStrut(40); 
   myPanel1.add(horizontalStrut);
   myPanel1.add(myButton2);
   Box myBox1 = new Box(BoxLayout.Y_AXIS);
   myBox1.add(Box.createVerticalStrut(20)); 
   myBox1.add(new JLabel(" Метка1"));
   myBox1.add(Box.createVerticalGlue());
   myBox1.add(new JLabel(" Метка2")); 
   myBox1.add(Box.createVerticalGlue()); 
   myBox1.add(new JCheckBox(" Выбор")); 
   myBox1.add(Box.createVerticalStrut(20));
   ButtonGroup myGroup = new ButtonGroup(); 
   JPanel myPanel2 = new JPanel(); 
   ArrayList < JRadioButton > masRB = new ArrayList < JRadioButton >
   (); myPanel2.setLayout(new GridLayout(3, 2)); 
   for (int i = 0; i < 6; i++) {
    masRB.add(new JRadioButton(" Выбор" + i));
    myGroup.add(masRB.get(i)); 
    myPanel2.add(masRB.get(i)); 
   }
   masRB.get(0).setSelected(true);
   frame.add(myPanel1, BorderLayout.NORTH); frame.add(myBox1, BorderLayout.WEST); frame.add(new JTextArea(), BorderLayout.CENTER); frame.add(myPanel2, BorderLayout.EAST); frame.add(new JTextField(), BorderLayout.SOUTH);
   frame.setVisible(true); 
   frame.pack(); 
   frame.setMinimumSize(frame.getSize());
  }
 }