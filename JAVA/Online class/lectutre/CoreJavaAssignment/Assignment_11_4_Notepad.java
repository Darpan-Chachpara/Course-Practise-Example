package lectutre.CoreJavaAssignment;
import java.awt.*;
import javax.swing.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Assignment_11_4_Notepad implements ActionListener
{
	JFrame f;
	JMenuBar mb;
	JMenu file,edit,view;
	JMenuItem cut,copy,paste,selectAll;
	JTextArea ta;
	
	Assignment_11_4_Notepad()
	{
		f=new JFrame();
		cut=new JMenuItem("cut");
		copy=new JMenuItem("copy");
		paste=new JMenuItem("paste");
		selectAll=new JMenuItem("SelectAll");
		
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		selectAll.addActionListener(this);
		
		mb=new JMenuBar();
		mb.setBounds(5, 5, 460, 25);
		
		file=new JMenu("File");
		edit=new JMenu("Edit");
		view=new JMenu("View");
		
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(selectAll);
		
		mb.add(file);
		mb.add(edit);
		mb.add(view);
		
		ta=new JTextArea();
		ta.setBounds(5, 30, 460, 460);
		
		f.add(mb);
		f.add(ta);
		
		f.setLayout(null);
		f.setSize(500, 500);
		f.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==cut)
		ta.cut();
		if(e.getSource()==copy)
			ta.copy();
		if(e.getSource()==paste)
			ta.paste();
		if(e.getSource()==selectAll)
			ta.selectAll();
		
		
	}
	
	public static void main(String[] args) 
	{
		new Assignment_11_4_Notepad();
	}

}
