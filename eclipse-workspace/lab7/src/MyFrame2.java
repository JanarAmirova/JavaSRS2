import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
public class MyFrame2 {
	public static String[] items = {
			"Element 1",
			"Element 2",
			"Element 3"
	};
	
 public static void main(String[] args) {
  JFrame frame = new JFrame("FrameDemo");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(900, 700);
  setNorth(frame);
  setWest(frame);
  setEast(frame);
  setCenter(frame);
  setSouth(frame);
  frame.setVisible(true);
  frame.pack();
  frame.setMinimumSize(frame.getSize());
 }
 public static void setSouth(JFrame fr) {
  JPanel myPanel1 = new JPanel();
  myPanel1.add(new JSlider());
  myPanel1.setLayout(new FlowLayout());
   Component horizontalStrut =
   Box.createHorizontalStrut(100); myPanel1.add(horizontalStrut); fr.add(myPanel1, BorderLayout.SOUTH);
  }
  public static void setCenter(JFrame fr) {
	  fr.setPreferredSize(new Dimension(600, 500));
   JPanel myPanel4 = new JPanel();
   myPanel4.setLayout(new FlowLayout());
   myPanel4.add(new JComboBox(items));
   myPanel4.add(new JSpinner());
   myPanel4.add(new JRadioButton ("Радиокнопка 1"));
   myPanel4.add(new JRadioButton ("Радиокнопка 2"));
   fr.add(myPanel4, FlowLayout.CENTER);
   
  }
  
  public static void setWest(JFrame fr) {
   ButtonGroup myGroup = new ButtonGroup();
   JPanel myPanel2 = new JPanel();
   ArrayList<JCheckBox> masRB = new ArrayList<JCheckBox>();
   myPanel2.setLayout(new GridLayout(9, 1));
   for (int i = 0; i< 9; i++) {
	   int ir = i + 1;
    masRB.add(new JCheckBox("Выбор"+ ir)); 
    myGroup.add(masRB.get(i));
    myPanel2.add(masRB.get(i));
   }
   masRB.get(0).setSelected(true);
   fr.add(myPanel2, BorderLayout.WEST);
  }
  public static void setEast(JFrame fr) {
	  JTextArea myText = new JTextArea(20,20);
	  myText.append("Текстовая область");
      fr.add(myText, BorderLayout.EAST);
  }
  public static void setNorth(JFrame fr) {
  JPanel myPanel3 = new JPanel();
  ArrayList<JTextField> masRB = new ArrayList<JTextField>();
  myPanel3.setLayout(new GridLayout(2, 3));
  for (int i = 0; i< 6; i++) {
	  int ir = i+1;
   masRB.add(new JTextField("Текстовое поле " + ir));
   myPanel3.add(masRB.get(i));
  }
  fr.add(myPanel3, BorderLayout.NORTH);
 }
 }