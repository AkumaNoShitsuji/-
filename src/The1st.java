import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;


public class The1st extends JFrame {
 
	 The1st(){
		 super("����� 1");
			setDefaultCloseOperation(HIDE_ON_CLOSE);
			
		
			JTextArea textArea = new JTextArea(1, 20);
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			textArea.append("  ");				
			
			/*JTextField textField = new JTextField("��������� ����", 20);
			//textField.setCaretColor(Color.BLUE);
			textField.setHorizontalAlignment(JTextField.LEFT);*/
					
			
			JButton button = new JButton("����� ����");						
			
			
			String[] elements = new String[] {"���", "���","�����"};
			JComboBox combo = new JComboBox(elements);
			combo.setSelectedIndex(1);
			
			
			
		/*	button.addMouseListener(new MouseListener)
			{
				public void mouseClicked(MouseEvent event)
				{
					if (textArea) combo.add(textArea.)
				}
			}*/
						
			
			JPanel panel = new JPanel();
			panel.add(textArea);
			panel.add(button);
			panel.add(combo);
			setContentPane(panel);
			
			
		
			pack();
			
	}
	 
}


/*
 
 
 ok.addMouseListener(new MouseListener() {
 
public void mouseClicked(MouseEvent event) {
if (loginField.getText().equals("����"))
JOptionPane.showMessageDialog(null, "���� ��������");
else JOptionPane.showMessageDialog(null, "���� �� ��������");
}
 
public void mouseEntered(MouseEvent event) {}
 
public void mouseExited(MouseEvent event) {}
 
public void mousePressed(MouseEvent event) {}
 
public void mouseReleased(MouseEvent event) {}
 
});
 
 
 
	class MouseL implements MouseListener {
		 
		ok.addMouseListener(new MouseAdapter() {
			 
			public void mouseClicked(MouseEvent event) {
			if (loginField.getText().equals("����"))
			JOptionPane.showMessageDialog(null, "���� ��������");
			else JOptionPane.showMessageDialog(null, "���� �� ��������");
			}
			 
			});
	}
}



class MouseL implements MouseListener {
 
public void mouseClicked(MouseEvent event) {
if (loginField.getText().equals("����"))
JOptionPane.showMessageDialog(null, "���� ��������");
else JOptionPane.showMessageDialog(null, "���� �� ��������");
}

}


//button.setMargin(new Insets(0, 10, 20, 30));
			//button.setSize(120, 30);
			//button.setLocation(20,50);

*/
