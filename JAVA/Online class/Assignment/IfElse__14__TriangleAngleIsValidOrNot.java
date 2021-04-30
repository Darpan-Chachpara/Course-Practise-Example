package Assignment;

import java.util.Scanner;

public class IfElse__14__TriangleAngleIsValidOrNot 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE FIRST ANGLE OF THE TRIANGLE : ");
		double angle1=sc.nextDouble();
		System.out.println("ENTER THE SECOND ANGLE OF THE TRIANGLE : ");
		double angle2=sc.nextDouble();
		System.out.println("ENTER THE THIRD ANGLE OF THE TRIANGLE : ");
		double angle3=sc.nextDouble();
		
		double sum=angle1+angle2+angle3;
		if(sum==180)
		{
			System.out.println("\n");
			System.out.println("TRIANGLE IS VALID");
		}
		else
		{
			System.out.println("\n");
			System.out.println("TRIANGLE IS INVALID");
		}
		sc.close();
		
	}

}
