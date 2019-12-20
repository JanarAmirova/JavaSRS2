import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
public class MyFrame3 {
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
  myPanel1.add(new JPasswordField());
  myPanel1.setLayout(new FlowLayout());
   Component horizontalStrut =
   Box.createHorizontalStrut(100); myPanel1.add(horizontalStrut); fr.add(myPanel1, BorderLayout.SOUTH);
  }
  public static void setCenter(JFrame fr) {
   JPanel myPanel4 = new JPanel();
   myPanel4.add(Box.createVerticalStrut(10));
   myPanel4.add(new JRadioButton ("Радиокнопка 1"));
   myPanel4.add(Box.createVerticalGlue());
   myPanel4.add(new JRadioButton ("Радиокнопка 2"));
   myPanel4.add(Box.createVerticalGlue());
   myPanel4.add(new JComboBox(items));
   myPanel4.add(new JSpinner());
   myPanel4.add(Box.createVerticalStrut(10));
   fr.add(myPanel4, BorderLayout.CENTER);
  }
  public static void setWest(JFrame fr) {
   ButtonGroup myGroup = new ButtonGroup();
   JPanel myPanel2 = new JPanel();
   ArrayList<JButton> masRB = new ArrayList<JButton>();
   myPanel2.setLayout(new GridLayout(9, 1));
   for (int i = 0; i< 9; i++) {
    masRB.add(new JButton("Кнопка"+ i));
    myGroup.add(masRB.get(i));
    myPanel2.add(masRB.get(i));
   }
   masRB.get(0).setSelected(true);
   fr.add(myPanel2, BorderLayout.WEST);
  }
  public static void setEast(JFrame fr) {
	 ButtonGroup myGroup1 = new ButtonGroup();
	 JPanel myPanel5 = new JPanel();
	 ArrayList<JRadioButton> masRB = new ArrayList<JRadioButton>();
	 myPanel5.setLayout(new GridLayout(9, 1));
	 for (int i = 0; i< 9; i++) {
	 masRB.add(new JRadioButton("Выбор"+ i));
	 myGroup1.add(masRB.get(i));
	 myPanel5.add(masRB.get(i));
	 }
	 masRB.get(0).setSelected(true);
     fr.add(myPanel5, BorderLayout.EAST);
  }
  public static void setNorth(JFrame fr) {
  JPanel myPanel3 = new JPanel();
  ArrayList<JLabel> masRB = new ArrayList<JLabel>();
  myPanel3.setLayout(new GridLayout(1, 6));
  for (int i = 0; i< 6; i++) {
   masRB.add(new JLabel("Метка "+ i));
   myPanel3.add(masRB.get(i));
  }
  fr.add(myPanel3, BorderLayout.NORTH);
 }
 }