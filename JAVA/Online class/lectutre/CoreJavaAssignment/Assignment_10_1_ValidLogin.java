package lectutre.CoreJavaAssignment;

import java.awt.*;  
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane; 

public class Assignment_10_1_ValidLogin 
{

	public static void main(String[] args)
	{
		final JFrame f=new JFrame("ActionListener Example");  
	    Label l1 =new Label("Username :");
		l1.setBounds(50,50,80,30);
		l1.setBackground(Color.yellow);
		f.add(l1);
		final TextField t1 =new TextField();
		t1.setBounds(200,50,80,30);
		t1.setBackground(Color.yellow);
		f.add(t1);
		
	    Label l2 =new Label("Password :");
	    l2.setBounds(50,100,80,30);
		l2.setBackground(Color.yellow);
		f.add(l2);
		final TextField t2 =new TextField();
		t2.setBounds(200,100,80,30);
		t2.setBackground(Color.yellow);
		f.add(t2);
		
		final Button b1 =new Button("OK");
		b1.setBounds(35,200,80,30);
		b1.setBackground(Color.yellow);
		f.add(b1);
		
		Button b2 =new Button("Cancel");
		b2.setBounds(120,200,80,30);
		b2.setBackground(Color.yellow);
		f.add(b2); 
		
		f.getContentPane().setBackground(Color.red);

	  
	    b1.addActionListener(new ActionListener()
	    {  
	    	public void actionPerformed(ActionEvent e)
	    	{  
	            String s1 =  t1.getText();
	            String s2 =t2.getText();
	            if(s1.equals("Darpan") && s2.equals("Darpan126"))
	            {
	            	JOptionPane.showMessageDialog(b1, this, "Login Successful", 0);
	            }
	            else
	            {
	            	JOptionPane.showMessageDialog(b1, this, "Invalid Username or Password", 0);
	            }
	    	}  
	    });  
	    
	    b2.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e)
	        {
	           f.dispose();
	        }
	    });
	    
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);   
	}

}
