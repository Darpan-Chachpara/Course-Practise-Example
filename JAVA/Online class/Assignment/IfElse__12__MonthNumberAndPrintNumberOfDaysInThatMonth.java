package Assignment;

import java.util.Scanner;

public class IfElse__12__MonthNumberAndPrintNumberOfDaysInThatMonth
{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER THE NUMBER : ");
			int num=sc.nextInt();
			if(num==1)
			{
				System.out.println("\n");
				System.out.println(num+" JANUARY 31 DAYS");
			}
			else if(num==2)
			{
				System.out.println("\n");
				System.out.println(num+" FEBRUARY 28 OR 29 DAYS");
			}
			else if(num==3)
			{
				System.out.println("\n");
				System.out.println(num+" MARCH 31 DAYS");
			}
			else if(num==4)
			{
				System.out.println("\n");
				System.out.println(num+" APRIL 30 DAYS");
			}
			else if(num==5)
			{
				System.out.println("\n");
				System.out.println(num+" MAY 31 DAYS");
			}
			else if(num==6)
			{
				System.out.println("\n");
				System.out.println(num+" JUNE 30 DAYS ");
			}
			else if(num==7)
			{
				System.out.println("\n");
				System.out.println(num+" JULY 31 DAYS");
			}
			else if(num==8)
			{
				System.out.println("\n");
				System.out.println(num+" AUGUST 31 DAYS");
			}
			else if(num==9)
			{
				System.out.println("\n");
				System.out.println(num+" SEPTEMBER 30 DAYS");
			}
			else if(num==10)
			{
				System.out.println("\n");
				System.out.println(num+" OCTOBER 31 DAYS");
			}
			else if(num==11)
			{
				System.out.println("\n");
				System.out.println(num+" NOVEMBER 30 DAYS");
			}
			else if(num==12)
			{
				System.out.println("\n");
				System.out.println(num+" DECEMBER 31 DAYS");
			}
			else
			{
				System.out.println("\n WRONG INPUT ! ENTER INPUT NUMBER BETWEEN(1 TO 12)");
			}
			sc.close();
		}
}
