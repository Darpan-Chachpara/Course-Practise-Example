package lectutre.CoreJavaAssignment;
import java.io.*; 

public class Assignment_12_6_Read_Console_Data_Using_BufferReader
{

	public static void main(String[] args) 
	{
		Console console = System.console(); 

    if (console == null) 
    { 
        System.out.println ("NO CONSOLE AVAILABLE"); 
        return; 
    } 
    
    	String str = console.readLine("ENTER STRING : "); //Read Line
    	System.out.println("YOU ENTERED : " + str); //Print
	}

}
