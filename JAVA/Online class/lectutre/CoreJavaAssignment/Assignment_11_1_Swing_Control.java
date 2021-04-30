package lectutre.CoreJavaAssignment;
import java.awt.Checkbox;
import java.awt.Color;

import javax.swing.*;
public class Assignment_11_1_Swing_Control extends JFrame
{

	JLabel l1, l2;
	JTextField t1;
	JTextArea ta1, ta2;
	JCheckBox c1, c2;
	JRadioButton rb1, rb2;
	JComboBox cb;
	JButton b;
	JPasswordField p;
	
	Assignment_11_1_Swing_Control() 
	{
		JFrame f = new JFrame("Register");
		 l1 = new JLabel("WELCOME");
		 l1.setBounds(50,50,200,50);
			l1.setBackground(Color.magenta);
			f.add(l1);
			f.setSize(500,500);
			f.setLayout(null);
			f.setVisible(true);
			
		t1 = new JTextField("TextField");
		t1.setBounds(120,60,400,30);
		t1.setBackground(Color.yellow);
		t1.setForeground(Color.red);
		f.add(t1);
		
		ta1 = new JTextArea("TextArea");
		ta1.setBounds(50,100,180,80);
		ta1.setBackground(Color.white);
		f.add(ta1);
		
		p = new JPasswordField();
		p.setBounds(240,125,240,30);
		f.add(p);

		c1 = new JCheckBox("Core Java");
		c1.setBounds(50,170,100,60);
		f.add(c1);
		
		c2 = new JCheckBox("Adv Java");
		c2.setBounds(150,170,100,60);
		f.add(c2);		
		f.setVisible(true);
		
		rb1 = new JRadioButton("Male");
		rb1.setBounds(250, 170, 100, 60);
		f.add(rb1);
		
		rb2 = new JRadioButton("Female");
		rb2.setBounds(350, 170, 100, 60);
		f.add(rb2);
		
		ta2 = new JTextArea("TextArea");
		ta2.setBounds(450,190,30,80);
		ta2.setBackground(Color.white);
		f.add(ta2);
		
		cb = new JComboBox<>();
		cb.addItem("AAAA");
		cb.addItem("AAAAA");
		cb.addItem("AAAAAA");
		cb.addItem("AAAAAAA");
		cb.setBounds(500, 190, 80, 25);
		f.add(cb);
		
		b = new JButton("Submit");
		b.setBounds(600, 190, 80, 25);
		f.add(b);
		
	}
	
	public static void main(String[] args) 
	{
		new Assignment_11_1_Swing_Control();
	}

}
