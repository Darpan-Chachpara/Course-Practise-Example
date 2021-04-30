package lectutre.CoreJavaAssignment;
import java.io.File;
import java.util.Date;
import java.io.*; 
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Assignment_12_1_File_Specification
{

	public static void main(String[] args) throws IOException,URISyntaxException
	{
		//isFile example
        File f = new File("C:\\Users\\Darpan\\Desktop\\TRAINING\\JAVA\\xyz.txt");
        // Check if the specified file is present or not 
        if (f.isFile()) 
            System.out.println("File"); 
        else
            System.out.println("Not a File"); 
        
        //isDirectory
        File f1 = new File("C:\\Users\\Darpan\\Desktop\\JAVA JAR FILE"); 
        // Check if the specified path is a directory or not 
        if (f1.isDirectory()) 
            System.out.println("Directory"); 
        else
            System.out.println("is not Directory"); 
        
        //last modified date
        File file = new File("C:\\Users\\Darpan\\Desktop\\TRAINING\\JAVA");
        Date date=new Date(file.lastModified());
        System.out.println("\nThe file was last modified on: "+date+"\n");
        
        //File size
        String fileName = "C:\\Users\\Darpan\\Desktop\\Website";
        File f2 = new File(fileName);
        long fileSize = f2.length();
        System.out.format("The size of the file: %d bytes", fileSize);

        //File Path
        File file1 = new File("C:\\Users\\Darpan\\Desktop\\TRAINING\\FILES");
        file1 = new File(new URI("C:\\Users\\Darpan\\Desktop\\TRAINING\\FILES"));
		printPaths(file1);
	}

	private static void printPaths(File file1) throws IOException
	{
		System.out.println("Path: " + file1.getPath());

		
	}

}


/*

*/