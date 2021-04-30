package Applet;
import java.awt.FlowLayout;
import java.applet.Applet;
import javax.swing.*;

//<applet code="Layout.class" width="250" height="250"></applet>


public class Layout extends Applet
{
	public void init()
	{
		FlowLayout flow=new FlowLayout();
		setLayout(flow);
		//GridLayout grid=new GridLayout();
		//setLayout(grid);
		//setLayout(new BoardedLayout());
			JButton b1=new JButton("NORTH");
			JButton b2=new JButton("SOUTH");
			JButton b3=new JButton("EAST");
			JButton b4=new JButton("WEST");
			JButton b5=new JButton("CENTRE");
			add(b1);
			add(b2);
			add(b3);
			add(b4);
			add(b5);

	
	}

}
