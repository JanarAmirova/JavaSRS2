import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
public class MyEvents {
	public static String[] items = {
			"������� ",
			"����� ",
			"��������"
	};
	private static JTextArea myText;
	
	
	
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
   myPanel4.add(new JRadioButton ("����������� 1"));
   myPanel4.add(new JRadioButton ("����������� 2"));
   fr.add(myPanel4, FlowLayout.CENTER);
   
  }
  public static void setEast(JFrame fr) {
	  JPanel myPanel5 = new JPanel();
	  myPanel5.setLayout(new GridLayout(3, 1));
	  myPanel5.add(new JLabel("����� ���������� �� LoveBooks"));
	  myPanel5.add(new JTextArea(100,20));
	  myPanel5.add(new JButton("��������� �����."));
      fr.add(myPanel5, BorderLayout.EAST);
  }
  public static void setWest(JFrame fr) {
   ButtonGroup myGroup = new ButtonGroup();
   JPanel myPanel2 = new JPanel();
   myPanel2.setLayout(new GridLayout(5, 1));
   JRadioButton ch1 = new JRadioButton("�����");
   ch1.addActionListener (new ActionListener(){
	   public void actionPerformed(ActionEvent ev) {
		  JOptionPane.showMessageDialog(null, "����� � ����� ������, �������������� � ������� � ����������������� �������������. ����� ������ ����");;
	   }
   });
   JRadioButton ch2 = new JRadioButton ("1984");
   ch2.addActionListener (new ActionListener(){
	   public void actionPerformed(ActionEvent ev) {
		  JOptionPane.showMessageDialog(null, "����������, � ������� �� ������������ ���, ��� ��� ����� ��������, ����� � ������. ����� ������ ������");;
	   }
   });
   JRadioButton ch3 = new JRadioButton ("�������� ����");
   ch3.addActionListener (new ActionListener(){
	   public void actionPerformed(ActionEvent ev) {
		  JOptionPane.showMessageDialog(null, "���������� � ����, ��������� ����� ����������, ��� ���� �� �����- � ��������. ����� ������ �������");;
	   }
   });
   JRadioButton ch4 = new JRadioButton ("������ � ������");
   ch4.addActionListener (new ActionListener(){
	   public void actionPerformed(ActionEvent ev) {
		  JOptionPane.showMessageDialog(null, "����� � ������� ���������� ������������ � ����. ����� ��� �����");;
	   }
   });
   JRadioButton ch5 = new JRadioButton ("����� ��� ����");
   ch5.addActionListener (new ActionListener(){
	   public void actionPerformed(ActionEvent ev) {
		  JOptionPane.showMessageDialog(null, "��������, �������������� � ����� ������� ������ ���, ����� ���������� � ���������. ����� ����� ���� ");;
	   }
   });
   myPanel2.add(ch1);
   myPanel2.add(ch2);
   myPanel2.add(ch3);
   myPanel2.add(ch4);
   myPanel2.add(ch5);
   fr.add(myPanel2, BorderLayout.WEST);
  }
  
  public static void setNorth(JFrame fr) {
  JPanel myPanel3 = new JPanel();
  ArrayList<JTextField> masRB = new ArrayList<JTextField>();
  myPanel3.setLayout(new GridLayout(2, 3));
  for (int i = 0; i< 6; i++) {
	  int ir = i+1;
   masRB.add(new JTextField("��������� ���� " + ir));
   myPanel3.add(masRB.get(i));
  
  }
  fr.add(myPanel3, BorderLayout.NORTH);
 }
 }