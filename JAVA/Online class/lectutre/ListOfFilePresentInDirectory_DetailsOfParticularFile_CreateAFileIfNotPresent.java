package lectutre;

import java.io.*;

public class ListOfFilePresentInDirectory_DetailsOfParticularFile_CreateAFileIfNotPresent
{

	public static void main(String[] args)
	{
		File f=new File("C:\\Users\\Darpan\\Desktop\\TRAINING");
		String []s=f.list();
		for(String s1:s)
		{
			System.out.println(s1);
		}
		
		System.out.println("\n");
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.exists());
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		
		/*
		 import java.io.*;
		 class XYZ
		 File f=new File("C:\\Darpan");
		 f.xyz();
		 //f.createNewFile();
		 System.out.println("success");

		 

		 */

	}

}
