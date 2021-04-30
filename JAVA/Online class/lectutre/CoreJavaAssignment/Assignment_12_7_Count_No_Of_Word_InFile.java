package lectutre.CoreJavaAssignment;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;  
public class Assignment_12_7_Count_No_Of_Word_InFile
{

	public static void main(String[] args) throws IOException
	{
		String letter;  
        int count = 0;  
        
        BufferedReader br = new BufferedReader(new FileReader("xyz.txt")); 
        
        while((letter = br.readLine()) != null)
        {  
            String words[] = letter.split(" ");  //Splits each line into words  
            count = count + words.length;   //Counts each word  
        }
        System.out.println("NUMBER OF WORDS PRESENT IN GIVEN FILE : " + count);  

	}

}
