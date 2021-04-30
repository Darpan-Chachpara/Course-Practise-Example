package lectutre.CoreJavaAssignment;

import java.util.Scanner;

public class Assignment_4_3_Use_of_String_Class_Method 
{

	public static void main(String[] args)
	{
		String s1,s2;
		Scanner s =new Scanner(System.in);
		System.out.println("ENTER THE FIRST STRING");
		 s1 =s.next();
		 System.out.println("ENTER THE SECOND STRING");
		 s2 =s.next();
		
		 System.out.println("\n");
		System.out.println(s1.charAt(5));
		System.out.println(s1.length());
		System.out.println(s1.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s1.replace("D","Z"));
		System.out.println(s1.substring(2,6));
		System.out.println(s1.concat("FC"));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.trim());
				
	}

}
