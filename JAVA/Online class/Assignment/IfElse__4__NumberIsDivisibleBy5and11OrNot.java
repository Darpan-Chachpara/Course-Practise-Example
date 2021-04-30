package Assignment;

import java.util.Scanner;

public class IfElse__4__NumberIsDivisibleBy5and11OrNot 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		double num=sc.nextDouble();
		
		if((num%5==0) && (num%11==0))
		{
			System.out.println("GIVEN NUMBER "+num+" IS DIVISIBLE BY 5 AND 11");
		}
		else
		{
			System.out.println("GIVEN NUMBER "+num+" IS NOT DIVISIBLE BY 5 AND 11");
		}
		sc.close();
	}

}



