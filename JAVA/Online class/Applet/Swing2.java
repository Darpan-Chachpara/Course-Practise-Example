package Applet;
import javax.swing.*;

public class Swing2 extends JFrame
{
	Swing2(String str)
	{
		super(str);
		setSize(250,250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) 
	{
		Swing2 f=new Swing2("XYZ");
	}

}
