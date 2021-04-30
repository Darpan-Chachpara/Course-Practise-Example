package lectutre.CoreJavaAssignment;
import java.io.*;
public class Assignment_12_4_Read_Write_Using_BufferedClass 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedWriter out1=new BufferedWriter(new FileWriter("mom.txt")); 
		out1.write("I AM GREAT");
		out1.close();
		
		BufferedReader int1= new BufferedReader(new FileReader("mom.txt"));
		String str;
		while((str=int1.readLine())!=null)
		{
			System.out.println(str);
		}
		int1.close();
	}

}
