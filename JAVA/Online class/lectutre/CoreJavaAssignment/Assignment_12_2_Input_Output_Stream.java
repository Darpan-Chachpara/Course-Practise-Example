package lectutre.CoreJavaAssignment;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;


public class Assignment_12_2_Input_Output_Stream 
{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream fo=new FileOutputStream("HI.txt");
		String s="WELCOME-here";
		byte b[]=s.getBytes();
		fo.write(b);
		fo.close();
		System.out.println("Done");
		
		FileInputStream fin=new FileInputStream("HI.txt");
		int i=0;
		while((i=fin.read())!=-1)
		{
			System.out.println(i+" "+(char)i);
		}
				
		
	}
}
