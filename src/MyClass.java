import java.awt.*;
import javax.swing.*;


public class MyClass {

   public static void main(String[] args) {
   
	   JFrame myWindow = new SimpleWindow();
	   myWindow.setVisible(true);
	   
	   JFrame myWindow1 = new The1st();
	   myWindow1.setVisible(true);
	   
	   JFrame myWindow2 = new The2nd();
	   myWindow2.setVisible(true);
	
	}

}


//setRolloverIcon(Icon icon) ��������� ������ ������, 
//������� ����� ���������� ��� ��������� �� ������ ����, 
//setPressedIcon(Icon icon) � ������ ��� ������ � ������� ���������, 
//setDisableIcon(Icon icon) � ������ ��� ���������� ������. 
//������� �� ���� ������� ������������� ����� get.