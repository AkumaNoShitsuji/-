import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;


public class SimpleWindow extends JFrame {
	
	
	 
	SimpleWindow(){
	super("Окно");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	JPanel panel = new JPanel();
	getContentPane().add(panel);
	setSize(250,250);
	}
	 
	
	 
	
	 
	}
		


//Метод setContentPane(JPanel panel)
//позволяет заменить панель содержимого окна.