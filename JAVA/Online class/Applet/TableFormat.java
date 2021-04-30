package Applet;
import javax.swing.*;
import java.awt.*;

public class TableFormat 
{
	TableFormat()
	{
		JFrame f=new JFrame("XYZ");
		f.setSize(300,400);
		f.setVisible(true);
		
		Container c=f.getContentPane();
		c.setLayout(new FlowLayout());
		
		String data [][]={{"100","MNO","7410"},{"200","PQR","8520"},{"300","ABC","9630"}};
		String column[]= {"ID","NAME","SALARY"};
		
		JTable jt =new JTable(data,column);
		//jt.setBounds(30,40,200,300);
		JScrollPane sp=new JScrollPane(jt);
		c.add(jt);
	}

	public static void main(String[] args) 
	{
		new TableFormat();
	}

}
