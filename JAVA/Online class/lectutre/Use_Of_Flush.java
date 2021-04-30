package lectutre;

import java.io.*;
public class Use_Of_Flush {

	public static void main(String[] args) throws Exception
	{
		// if we don't use try catch use throws Exception
		FileWriter fw=new FileWriter("xyz.txt");
		fw.write("DARPAN ");
		fw.flush(); // will print everything coming in a flow
		fw.write("CHACHPARA");
		fw.close(); //will close everything the upcoming part will not execute
		System.out.println("Successful Done");
	}

}
