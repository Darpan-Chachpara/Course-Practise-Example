package Assignment;

import java.util.Scanner;

public class IfElse__16__TriangleIsEquilateralIsoscelesScalene {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE FIRST SIDE OF THE TRIANHGLE : ");
		double side1=sc.nextDouble();
		System.out.println("ENTER THE SECOND SIDE OF THE TRIANHGLE : ");
		double side2=sc.nextDouble();
		System.out.println("ENTER THE THIRD SIDE OF THE TRIANHGLE : ");
		double side3=sc.nextDouble();
		
		if(side1==side2 && side2==side3)
		{
			System.out.println("TRIANGLE IS EQUILATERAL TRIANGLE");
		}
		else if(side1==side2 || side2==side3 || side3==side1)
		{
			System.out.println("TRIANGLE IS ISOSCELES TRIANGLE");
		}
		else
		{
			System.out.println("TRIANGLE IS SCALENE TRIANGLE");

		}
		sc.close();
	}

}
