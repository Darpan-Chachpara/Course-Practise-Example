package Assignment;

import java.util.Scanner;

public class IfElse__1__MaximumBetweenTwo 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER : ");
		int num1=sc.nextInt();
		System.out.println("ENTER THE SECOND NUMBER : ");
		int num2=sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println("THE LARGEST NUMBER : "+num1);
		}
		else if(num2>num1)
		{
			System.out.println("THE LARGEST NUMBER : "+num2);
		}
		else
		{
			System.out.println("BOTH ARE EQUAL");
		}
		sc.close();
	}

}
