package Applet;
import javax.swing.*;
import java.awt.*;

//<applet code="ImageOnButton_Button_Swing_Applet.class" width="250" height="250"></applet>

public class ImageOnButton_Button_Swing_Applet extends JApplet
{
	public void init()
	{
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageOnButton_Button_Swing_Applet b1=new ImageOnButton_Button_Swing_Applet();
		c.add(b1);
		
		//ImageIcon i=new ImageTcon("boo1.jpg");
		//JButton b2 =new JButton("ABC".i);
		
		JButton b2=new JButton("ABC",new ImageIcon("book1.jpg"));
		b2.setToolTipText("ENJOY READING");
		c.add(b2);
	}
}
