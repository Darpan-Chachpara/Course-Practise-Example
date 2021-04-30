package Assignment;

import java.util.Scanner;

public class Basic__14__EnterBaseHeightFindAreaOfTriangle
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE BASE OF THE TRIANGLE : ");
		double base=sc.nextDouble();
		System.out.println("ENTER THE HEIGHT OF THE TRIANGLE : ");
		double height=sc.nextDouble();
		
		double area=(base*height)/2;
		System.out.println("THE AREA OF THE TRIANGLE IS : "+area);
		sc.close();
		
	}

}
