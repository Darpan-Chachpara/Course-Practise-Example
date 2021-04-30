package lectutre.CoreJavaAssignment;

import java.util.Scanner;

public class Assignment_2_2_EnterYearIsLeapOrNot
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE YEAR : ");
		int year=sc.nextInt();
		
		if((year%400==0) || (year%4==0 && (year%100!=0)))
		{
			System.out.println("ENTERED YEAR "+year+" IS A LEAP YEAR");
		}
		else
		{
			System.out.println("ENTERED YEAR "+year+" IS NOT A LEAP YEAR");
		}
		sc.close();
	}
}
