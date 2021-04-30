package lectutre.CoreJavaAssignment;

import java.awt.*;  
import java.awt.event.*;

import javax.swing.JFrame;  
public class Assignment_10_2_MouseEvent extends JFrame implements MouseListener
	{  
		   Label l;  
		   Assignment_10_2_MouseEvent()
		   {  
		        addMouseListener(this);  
				getContentPane().setBackground(Color.yellow);
		        l=new Label();  
		        l.setBounds(20,50,100,20);  
		        add(l);  
		        setSize(300,300);  
		        setLayout(null);  
		        setVisible(true);  
		    }  
		    public void mouseClicked(MouseEvent e) 
		    {  
		        l.setText("Darpan");  
		    }  
	    
	    public void mouseEntered(MouseEvent e) {}  
	    public void mouseExited(MouseEvent e) {}  
	    public void mousePressed(MouseEvent e) {}  
	    public void mouseReleased(MouseEvent e) {}  
	
	public static void main(String[] args) 
	{
		new Assignment_10_2_MouseEvent();
	}

}