package lectutre.CoreJavaAssignment;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

public class Assignment_11_3_MoveImage 
{
	
	private JFrame frame=new JFrame();
	private JLabel label=new JLabel();
	private int moveSpeed=15;
	public Assignment_11_3_MoveImage()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(600,600);
		frame.setTitle("Car");
		
		label.setBounds(150, 150, 250, 150);
		label.setIcon(new ImageIcon("C:\\Users\\Darpan\\Pictures\\Screenshots\\Screenshot(23).png"));
		frame.add(label);
		SwingUtilities.updateComponentTreeUI(frame);
		frame.addKeyListener(new KeyListener()
				{

					@Override
					public void keyTyped(KeyEvent e)
					{
						if(e.getKeyCode()==KeyEvent.VK_RIGHT)
						{
							label.setLocation(label.getLocation().x+moveSpeed,label.getLocation().y);
						}
						else if(e.getKeyCode()==KeyEvent.VK_LEFT)
						{
							label.setLocation(label.getLocation().x-moveSpeed,label.getLocation().y);
						}
						else if(e.getKeyCode()==KeyEvent.VK_UP)
						{
							label.setLocation(label.getLocation().x,label.getLocation().y-moveSpeed);
						}
						else if(e.getKeyCode()==KeyEvent.VK_DOWN)
						{
							label.setLocation(label.getLocation().x,label.getLocation().y+moveSpeed);
						}
						
					}

					@Override
					public void keyPressed(KeyEvent e)
					{
						if(e.getKeyCode()==KeyEvent.VK_RIGHT)
						{
							label.setLocation(label.getLocation().x+moveSpeed,label.getLocation().y);
						}
						else if(e.getKeyCode()==KeyEvent.VK_LEFT)
						{
							label.setLocation(label.getLocation().x-moveSpeed,label.getLocation().y);
						}
						else if(e.getKeyCode()==KeyEvent.VK_UP)
						{
							label.setLocation(label.getLocation().x,label.getLocation().y-moveSpeed);
						}
						else if(e.getKeyCode()==KeyEvent.VK_DOWN)
						{
							label.setLocation(label.getLocation().x,label.getLocation().y+moveSpeed);
						}
						
					}

					@Override
					public void keyReleased(KeyEvent e)
					{
						if(e.getKeyCode()==KeyEvent.VK_RIGHT)
						{
							label.setLocation(label.getLocation().x+moveSpeed,label.getLocation().y);
						}
						else if(e.getKeyCode()==KeyEvent.VK_LEFT)
						{
							label.setLocation(label.getLocation().x-moveSpeed,label.getLocation().y);
						}
						else if(e.getKeyCode()==KeyEvent.VK_UP)
						{
							label.setLocation(label.getLocation().x,label.getLocation().y-moveSpeed);
						}
						else if(e.getKeyCode()==KeyEvent.VK_DOWN)
						{
							label.setLocation(label.getLocation().x,label.getLocation().y+moveSpeed);
						}
						
					}
			
				});
	}


	public static void main(String[] args)
	{
		new Assignment_11_3_MoveImage();
	}

}
