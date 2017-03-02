import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;


public class The2nd extends JFrame {

	The2nd(){
		
		super("Пункт 2");
		  setDefaultCloseOperation(HIDE_ON_CLOSE);
		  JPanel panel = new JPanel();
		  
		  JTextArea textArea = new JTextArea();
		  
		  
		  JButton button1 = new JButton("1");
		  JButton button2 = new JButton("2");
		  panel.add(button1);
		  panel.add(button2);
		  
		  
		  setContentPane(panel);
		  setSize(200,80);
		
	}
}
