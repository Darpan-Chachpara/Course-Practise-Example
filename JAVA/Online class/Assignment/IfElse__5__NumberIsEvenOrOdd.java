package Assignment;

import java.util.Scanner;

public class IfElse__5__NumberIsEvenOrOdd
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENNTER THE NUMBER : ");
		double num=sc.nextDouble();
		if(num%2==0) 
		{
			System.out.println("THE NUMBER "+num+" IS EVEN NUMBER");
		}
		else
		{
			System.out.println("THE NUMBER "+num+" IS ODD NUNBER");
		}
		sc.close();
	}

}
