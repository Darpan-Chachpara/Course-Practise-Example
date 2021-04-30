package lectutre.CoreJavaAssignment;

import java.awt.Color;
import java.awt.Scrollbar;

import javax.swing.JFrame;

public class Assignment_9_4_ScrollBarExample 
{
	Scrollbar s1,s2,s3;
	Assignment_9_4_ScrollBarExample()
	{ 
		JFrame f =new JFrame("Scrollbar");
		s1=new Scrollbar();
		s1.setBounds(50, 50, 30, 60);
		s1.setBackground(Color.red);
		f.add(s1);
		
		s2 =new Scrollbar();
		s2.setBounds(100, 50, 30, 60);
		f.add(s2).setBackground(Color.green);
		
		s3 =new Scrollbar();
		s3.setBounds(150, 50, 30, 60);
		f.add(s3).setBackground(Color.blue);
		f.setSize(300,300);
		
		f.setLayout(null);
		f.setVisible(true);
		
		f.getContentPane().setBackground(Color.yellow);
		
	}
	
	public static void main(String[] args) 
	{
		new Assignment_9_4_ScrollBarExample();
	}

}
