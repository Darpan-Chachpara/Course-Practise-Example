package Assignment;

import java.util.Scanner;

public class Basic__13__EnterTwoAngleOfTriangleFindThird
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE FIRST ANGLE OF THE TRIANGLE : ");
		double first=sc.nextDouble();
		System.out.println("ENTER THE SECOND ANGLE OF THE TRIANGLE : ");
		double second=sc.nextDouble();
		
		double third=180-(first+second);
		
		System.out.println("THE THIRD ANGLE OF THE TRIANGLE IS : "+third);
		sc.close();
	}

}
