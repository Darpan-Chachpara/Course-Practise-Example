package Assignment;

import java.util.Scanner;

public class Basic__15__AreaOfEquilateralTriangle 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE LENGTH OF THE EQUILATERAL TRIANGLE : ");
		double side=sc.nextDouble();
		double area=Math.sqrt(3)/4*side*side;
		System.out.println("THE AREA OF EQUILATERAL TRIANGLE IS : "+area);
		sc.close();
	}

}
