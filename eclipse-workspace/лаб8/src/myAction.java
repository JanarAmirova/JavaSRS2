import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class myAction{
	public static JFrame myFrame;
	public static JButton myButton;
	public static JTextField myText1;
	public static JTextField myText2;
	public static void main(String[] args){
		initWindow();
		}
	private static void initWindow(){ 
		myFrame=new JFrame("Окно"); 
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myButton=new JButton("Копировать"); 
		myText1=new JTextField(); 
		myText1.setColumns(10); 
		myText2=new JTextField();
		myText2.setColumns(10); 
		JPanel myPanel=new JPanel(); 
		myPanel.add(myText1); 
		myPanel.add(myButton); 
		myPanel.add(myText2); 
		myButton.addActionListener( new ActionListener() { 
		public void actionPerformed(ActionEvent e) {
		myText2.setText(myText1.getText());}
		});
		myFrame.add(myPanel,BorderLayout.NORTH);
		myFrame.pack(); 
		myFrame.setMinimumSize(myFrame.getSize());
		myFrame.setVisible(true);
		}
		}