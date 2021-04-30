package Applet;
import javax.swing.*;

public class ImpJPanel
{
	public ImpJPanel()
	{
		JPanel panel=new JPanel();
		panel.add(new JButton("OK"));
		panel.add(new JButton("CANCEL"));
		
		JInternalFrame ifm=new JInternalFrame("INTERNALFRAME",true,true,true,true);
		ifm.setToolTipText("THIS IS INTERNAL fm");
		ifm.add(panel);
		ifm.setSize(250,300);
		ifm.setVisible(true);
		
		JFrame fm=new JFrame("OUTER FRAME");
		fm.add(new JDesktopPane().add(ifm));
		fm.setSize(400,400);
		fm.setVisible(true);
		
		//OK CANCEL BUTTON PLACED ON PANEL...
		//THEN PANEL IS PLACED ON INTERNALFRAME
		//INTERNALFRAME AND FRAME IS BEEN PATCHED USING (GLUE) DESKTOPPANE
		//THEN FRAME IS BEEN PLACED
		//DESKTOPPANE IS A GLUE TO JOIN INTERNALFRAAME AND FRAME
	}
}
