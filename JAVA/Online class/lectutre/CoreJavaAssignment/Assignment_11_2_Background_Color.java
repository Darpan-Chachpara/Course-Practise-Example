package lectutre.CoreJavaAssignment;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class Assignment_11_2_Background_Color extends JFrame implements ActionListener
	{    
		JButton b;    
		Container c;    
		Assignment_11_2_Background_Color()
		{    
		    c=getContentPane();  
			getContentPane().setBackground(Color.yellow);
		    c.setLayout(new FlowLayout());         
		    b=new JButton("COLOR");    
		    b.addActionListener(this);         
		    c.add(b);    
		}    
		public void actionPerformed(ActionEvent e) {    
		Color initialcolor=Color.PINK;    
		Color color=JColorChooser.showDialog(this,"SELECT A COLOR",initialcolor);    
		c.setBackground(color);    
		}    

	public static void main(String[] args) 
	{
		Assignment_11_2_Background_Color bg=new Assignment_11_2_Background_Color();    
	    bg.setSize(400,400);    
	    bg.setVisible(true);    
	    bg.setDefaultCloseOperation(EXIT_ON_CLOSE);  
	}

}
