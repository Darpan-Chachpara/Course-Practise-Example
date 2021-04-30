package Assignment;

import java.util.Scanner;

public class IfElse__6__YearIsLeapYearOrNot
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE YEAR : ");
		int year=sc.nextInt();
		
		if(((year%4==0) &&  (year%100!=0))  ||  (year%400==0))
		{
			System.out.println(year+" IS THE LEAP YEAR");
		}
		else
		{
			System.out.println(year+" IS THE NOT LEAP YEAR");

		}
		sc.close();
	}

}
