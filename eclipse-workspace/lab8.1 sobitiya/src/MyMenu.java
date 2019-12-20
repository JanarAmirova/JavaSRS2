import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyMenu extends JFrame {
 public MyMenu(String name) {
   super(name);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   JMenuBar menuBar = new JMenuBar();
   JMenu Menu1 = new JMenu("Файл");
   Menu1.add(new JMenuItem("Новый"));
   Menu1.add(new JMenuItem("Открыть"));
   Menu1.add(new JMenuItem("Сохранить"));
   Menu1.addSeparator();
   JMenuItem exit = new JMenuItem("Выйти");
   exit.addActionListener(new ActionListener()){
   }
  
     public void actionPerformed(ActionEvent event) {
      JOptionPane.showMessageDialog(null, "Кнопка работает");
     }
     
     Menu1.add((ActionListener) exit);
     JMenu Menu2 = new JMenu("Задача 1");
     Menu2.add(new JMenuItem("Запустить"));
     JMenu Menu3 = new JMenu("Изменить условия");
     Menu3.add(new JMenuItem("Условие 1"));
     Menu3.add(new JMenuItem("Условие 2"));
     Menu2.add(Menu3);
     menuBar.add(Menu1);
     menuBar.add(Menu2);
     setJMenuBar(menuBar);
     setSize(350, 250);
    }
   }