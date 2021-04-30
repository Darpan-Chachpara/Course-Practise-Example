package lectutre;
import java.io.*;

import java.io.File;

public class DirectoryPart {

	public static void main(String[] args) throws Exception
	{
		File f =new File("C:\\Users\\Darpan\\Desktop\\TRAINING\\JAVA\\xyz.txt");
		if(f.mkdir())
		
			System.out.println("Create A Directory");
		
		else
		
			System.out.println("Unable To Create Directory");
		
		
		File f1 =new File("C:\\Users\\Darpan\\Desktop\\TRAINING\\JAVA\\xyz.txt");
		String []str=f1.list();
		for(int i=0;i<str.length;i++)
			System.out.println(str[i]);
		
	}

}
