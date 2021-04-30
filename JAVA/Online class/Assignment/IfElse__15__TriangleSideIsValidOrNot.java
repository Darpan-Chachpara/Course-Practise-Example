package Assignment;

import java.util.Scanner;

public class IfElse__15__TriangleSideIsValidOrNot
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE FIRST SIDE OF THE TRIANGLE : ");
		double side1=sc.nextDouble();
		System.out.println("ENTER THE SECOND SIDE OF THE TRIANGLE : ");
		double side2=sc.nextDouble();
		System.out.println("ENTER THE THIRD SIDE OF THE TRIANGLE : ");
		double side3=sc.nextDouble();
		
		if((side1+side2)>side3)
		{
			if((side2+side3)>side1)
			{
				if((side1+side3)>side2)
				{
					System.out.println("TRIANGLE IS VALID");
				}
				else
				{
					System.out.println("TRIANGLE IS NOT VALID");
				}
			}
			else
			{
				System.out.println("TRIANGLE IS NOT VALID");
			}
		}
		else
		{
			System.out.println("TRIANGLE NOT IS VALID");
		}
		sc.close();
	}

}
