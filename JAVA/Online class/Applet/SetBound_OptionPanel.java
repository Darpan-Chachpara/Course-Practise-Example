package Applet;
import javax.swing.*;
import java.awt.*;
public class SetBound_OptionPanel
{
	public static void main(String[] args) 
	{
		JFrame f=new JFrame("XYZ");
		f.setSize(300,400);
		f.setVisible(true);
	
		//LABEL
		Label rn=new Label("Name");
		rn.setBounds(100, 100, 100, 50);
		
		//TEXTFIELD
		TextField trn=new TextField(25);
		trn.setBounds(100, 150, 100, 50);

		Label rn1=new Label("Address");
		rn1.setBounds(100, 200, 100, 50);
		
		TextField trn1=new TextField(25);
		trn1.setBounds(100, 250, 100, 50);
		
		//default title and icon
		JOptionPane.showMessageDialog(null,"HELLO WELCOME");
		
		//custom title,warning icon
		JOptionPane.showMessageDialog(null,"HELLO WELCOME","INANE WARNING",JOptionPane.WARNING_MESSAGE);
		
		//custom title,error icon
		JOptionPane.showMessageDialog(null,"HELLO WELCOME","INANE ERROR",JOptionPane.ERROR_MESSAGE);
		
		//custom title,no icon
		JOptionPane.showMessageDialog(null,"HELLO WELCOME","A PLAIN MESSAGE",JOptionPane.PLAIN_MESSAGE);

		//custom title,custom icon

		
		f.add(rn);
		f.add(trn);
		f.add(rn1);
		f.add(trn1);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
	
	}
	
}
