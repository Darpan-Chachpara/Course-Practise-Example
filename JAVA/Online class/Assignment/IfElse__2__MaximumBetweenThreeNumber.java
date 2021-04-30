package Assignment;

import java.util.Scanner;

public class IfElse__2__MaximumBetweenThreeNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER : ");
		double num1=sc.nextDouble();
		System.out.println("ENTER THE SECOND NUMBER : ");
		double num2=sc.nextDouble();
		System.out.println("ENTER THE THIRD NUMBER : ");
		double num3=sc.nextDouble();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println(num1+" IS THE MAXIMUM NUMBER");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println(num2+" IS THE MAXIMUM NUMBER");
		}
		else
		{
			System.out.println(num3+" IS THR MAXIMUM NUMBER");
		}
		sc.close();
	}

}
