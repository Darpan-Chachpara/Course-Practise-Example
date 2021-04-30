package lectutre.CoreJavaAssignment;
import java.awt.*;
import javax.swing.JFrame;

public class Assignment_9_3_AWTLogin extends JFrame
{
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	
	Assignment_9_3_AWTLogin()
	{
		
		l1 =new Label("Username :");
		l1.setBounds(50,50,80,30);
		l1.setBackground(Color.green);
		add(l1);
		t1 =new TextField();
		t1.setBounds(150,50,80,30);
		t1.setBackground(Color.orange);
		add(t1);
		
	    l2 =new Label("Password :");
	    l2.setBounds(50,100,80,30);
		l2.setBackground(Color.green);
		add(l2);
		t2 =new TextField();
		t2.setBounds(150,100,80,30);
		t2.setBackground(Color.orange);
		add(t2);
		
		b1 =new Button("OK");
		b1.setBounds(35,200,80,30);
		b1.setBackground(Color.yellow);
		add(b1);
		
		b2 =new Button("CANCEL");
		b2.setBounds(120,200,80,30);
		b2.setBackground(Color.yellow);
		add(b2);
		
		setSize(300,300);//frame size 300 width and 300 height  
		setLayout(null);//no layout manager  
		setVisible(true);
		//getContentPane().setBackground(Color.pink);

	}
	
	
	public static void main(String[] args) 
	{
		new Assignment_9_3_AWTLogin();
	}

}
