package Applet;

import java.applet.Applet;
import java.awt.*;

//<applet code="AppletDemo.class" width=250 height=250></applet>


public class AppletDemo  extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("HELLO WORLD",100,200); 
		setBackground(Color.green);
	}
}
