package Assignment;

import java.util.Scanner;

public class Basic__12__CalculateSquareRootOfEnteredNumber 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENTER THE NUMBER : ");
		double num=sc.nextDouble();
		
		double Squareroot=Math.sqrt(num);
		System.out.println("THE SQUARE OF GIVEN NUMBER "+num+" IS : "+Squareroot);
		sc.close();
	}

}
