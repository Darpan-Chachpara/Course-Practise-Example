package Assignment;

import java.util.Scanner;

public class Basic__5__LengthBreadthOfRectangleFindItsArea 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENTER THE LENGTH OF THE RECTANGLE :");
		double l=sc.nextDouble();
		System.out.println("ENTER THE BREADTH OF THE RECTANGLE :");
		double b=sc.nextDouble();
		
		double area=l*b;
		System.out.println("AREA OF RECTANGLE IS :"+area);
		sc.close();
		
	}
}
