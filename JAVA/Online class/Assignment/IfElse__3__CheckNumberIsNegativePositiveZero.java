package Assignment;

import java.util.Scanner;

public class IfElse__3__CheckNumberIsNegativePositiveZero 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		double num=sc.nextDouble();
		
		if(num>0)
		{
			System.out.println("THE INPUT NUMBER IS POSITIVE : "+num);
		}
		else if(num<0)
		{
			System.out.println("THE INPUT NUMBER IS NEGATIVE : "+num);
		}
		else if(num==0)
		{
			System.out.println("THE INPUT NUMBER IS EQUAL TO ZERO: "+num);
		}
		sc.close();
	}

}
