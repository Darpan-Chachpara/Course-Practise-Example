package Assignment;

import java.util.Scanner;

public class IfElse__11__InputWeekPrintWeekDay 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int num=sc.nextInt();
		if(num==1)
		{
			System.out.println("\n");
			System.out.println(num+" IS SUNDAY");
		}
		else if(num==2)
		{
			System.out.println("\n");
			System.out.println(num+" IS MONDAY");
		}
		else if(num==3)
		{
			System.out.println("\n");
			System.out.println(num+" IS TUESDAY");
		}
		else if(num==4)
		{
			System.out.println("\n");
			System.out.println(num+" IS WEDNESDAY");
		}
		else if(num==5)
		{
			System.out.println("\n");
			System.out.println(num+" IS THRUSDAY");
		}
		else if(num==6)
		{
			System.out.println("\n");
			System.out.println(num+" IS FRIDAY");
		}
		else if(num==7)
		{
			System.out.println("\n");
			System.out.println(num+" IS SATURDAY");
		}
		else
		{
			System.out.println("\n WRONG INPUT ! ENTER INPUT NUMBER BETWEEN(1 TO 7)");
		}
		sc.close();
	}

}
