package lectutre.CoreJavaAssignment;

import java.awt.Color;
import java.awt.Label;

import javax.swing.JFrame;

public class Assignment_9_5_Print_Particular_Font 
{

	Label l1;
	Assignment_9_5_Print_Particular_Font()
	{ 
		JFrame f =new JFrame("PRINT NAME");

		l1 =new Label("DARPAN CHACHPARA");
		l1.setBounds(60,60,130,60);
		l1.setBackground(Color.yellow);
		f.add(l1);
		f.setSize(300,300); //size of the box
		f.setLayout(null);
		f.setVisible(true);
		f.getContentPane().setBackground(Color.red);
		
	}
	
	public static void main(String[] args) 
	{
		new Assignment_9_5_Print_Particular_Font();
	}

}
