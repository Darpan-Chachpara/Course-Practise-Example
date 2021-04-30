package Applet;
import java.applet.*;
import java.awt.*;

//<applet code="GUI_Part.class" width="250" height="250"></applet>

public class GUI_Part extends Applet
{
	public void init()
	{
		Button b=new Button("Click Here!");
		add(b);
		
		Checkbox c=new Checkbox("Click Here!");
		add(c);
		
		Choice co=new Choice();
		co.add("XYZ");
		co.add("PQR");
		co.add("MNO");
		add(co);
		
		Label l=new Label("Enter U want to insert");
		add(l);
		
		TextField tf=new TextField(23);
		add(tf);
		
		TextArea ta=new TextArea();
		add(ta);
		
		

	}







}
