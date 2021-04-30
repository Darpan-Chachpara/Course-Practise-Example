package Assignment;

import java.util.Scanner;

public class Basic__10__ConvertDaysIntoYearsWeeksDays
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int num=sc.nextInt();
		
		int years=(num/365);
		int weeks=(num%365)/7;
		int days=(num%365)%7;
		
		System.out.println("NUMBER OF YEARS : "+years);
		System.out.println("NUMBER OF WEEKS : "+weeks);
		System.out.println("NUMBER OF DAYS : "+days);
		sc.close();
	}

}
