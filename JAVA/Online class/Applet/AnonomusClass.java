package Applet;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

//<applet code="AnonomusClass()" width="250" height="250"></applet>


public class AnonomusClass extends Applet
{
	public void init()
	{
		Button b=new Button("CLICK HERE!");
		add(b);
		// new is nothing but the  Anonomous class only
		b.addActionListener(new ActionListener() // here implementation is been happening not interface
				{
			public void actionPerformed(ActionEvent ae)
			{
				System.out.println("OPPS CLICK KARO");
			}
				});
	}

}

/*
 * IN DIFFERENT TYPE
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

//<applet code="ButtonEvent" width="200" height="200">
</applet>

public class ButtonEvent11 extends Applet 
	{
       

	public void init()
			{
               Button b= new Button("Click here!");
                add(b);
               b.addActionListener(new MyEvent());
             } 

	
	private  class MyEvent implements ActionListener 
    {
		public void actionPerformed(ActionEvent ae)
					{
					System.out.println("Dont Click!!");
					
					}
	    }
        
}
*/
