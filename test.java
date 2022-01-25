package Interactive;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;
public class GUI_test 
{
   public static void main(String[]args)
   {
	   JFrame frame = new JFrame("My Windows");
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setSize(600,600);
	   frame.getContentPane().setBackground(Color.BLACK);
	   
	   JButton button = new JButton("Press Me");
	   button.setBackground(Color.BLACK);
	   button.setSize(10,10);
	   frame.getContentPane().add(button,BorderLayout.CENTER);
	   
	   
	   JButton button2 = new JButton("Press 2");
	   button2.setBackground(Color.WHITE); 
	   button2.setSize(new Dimension(10,10));
	   frame.getContentPane().add(button2,BorderLayout.WEST);
	   
	   JButton button3 = new JButton("Press 3");
	   button3.setBackground(Color.GRAY);
	   button3.setSize(new Dimension(10,10));
	   frame.getContentPane().add(button3,BorderLayout.EAST);
	   frame.setVisible(true);
	   
   }
}
