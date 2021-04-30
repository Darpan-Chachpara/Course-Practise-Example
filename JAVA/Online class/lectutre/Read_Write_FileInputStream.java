package lectutre;
import java.io.*;
public class Read_Write_FileInputStream {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fin=new FileInputStream(new File("C:\\Users\\Darpan\\Desktop\\TRAINING\\JAVA\\Online class\\lectutre\\DC.txt"));
		int i;
		while((i=fin.read())!=-1)
		{
			System.out.println(i+" "+(char)i);
		}
	}

}

/*
import java.io.*;
public class ReadAFileInputStream {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fin=new FileInputStream(new File("C:\\Users\\Darpan\\Desktop\\TRAINING\\JAVA\\Online class\\lectutre\\DC.txt"));
		FileInputStream fout=new FileInputStream(new File("C:\\Users\\Darpan\\Desktop\\TRAINING\\JAVA\\Online class\\lectutre\\DCC.txt"));
		int i;
		while((i=fin.read())!=-1)
		{
		fout.write(i);
		}
		System.out.println("DONE SUCCESSFULLY");

	}

}
*/
