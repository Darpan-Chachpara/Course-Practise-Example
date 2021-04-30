package lectutre.CoreJavaAssignment;

import java.util.Scanner;

public class Assignment_3_3_Add
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE LENGTH OF FIRST ARRAY : ");
		int len=sc.nextInt();
		
		int a[]=new int[len];
		int b[]=new int[len];
		int add[]=new int[len];
		int sub[]=new int[len];
		int mul[]=new int[len];
		int div[]=new int[len];
		float mod[]=new float[len];
		
		for (int i = 0; i < len; i++){
	        System.out.print("Enter a value for first array, position " + i + ": ");
	        a[i] = sc.nextInt();
	    }
	    for (int i = 0; i < len; i++){
	        System.out.print("Enter a value for second array, position " + i + ": ");
	        b[i] = sc.nextInt();
	    }
	    
	    for(int i = 0; i <len; i++)
	    {
	       add[i] = a[i] + b[i];
	       sub[i] = a[i] - b[i];
	       mul[i] = a[i] * b[i];
	       div[i] = a[i] / b[i];
	       mod[i] = a[i] % b[i];
	   }
	    for(int i = 0; i <len; i++)
	    {
	    	System.out.println("\n");
	System.out.println("ADDITION "+add[i]+".");
	System.out.println("SUBTRACTION "+sub[i]+".");
	System.out.println("MULTIPLICATION "+mul[i]+".");
	System.out.println("DIVISION "+div[i]+".");
	System.out.println("MODE "+mod[i]+".");
	System.out.println("\n");
		
	}

}
}
