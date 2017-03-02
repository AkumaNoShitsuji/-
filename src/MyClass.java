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


//setRolloverIcon(Icon icon) позвол€ет задать значок, 
//который будет по€вл€тьс€ при наведении на кнопку мыши, 
//setPressedIcon(Icon icon) Ч значок дл€ кнопки в нажатом состо€нии, 
//setDisableIcon(Icon icon) Ч значок дл€ неактивной кнопки. 
// аждому из этих методов соответствует метод get.