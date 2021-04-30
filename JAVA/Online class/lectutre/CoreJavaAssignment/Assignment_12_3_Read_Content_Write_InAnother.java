package lectutre.CoreJavaAssignment;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;

public class Assignment_12_3_Read_Content_Write_InAnother 
{

	public static void main(String[] args) throws IOException
	{
	
            FileReader r = new FileReader("xyz.txt");
            int i;
 
            while ((i = r.read()) != -1) 
            {
                System.out.print((char) i);
            }
         r.close();
	
            FileWriter w = new FileWriter("xyz.txt",true);
            w.write("Hello World");
            w.write("\r\n");    // write new line
            w.write("Good Bye!");
            w.close();

	}
}
