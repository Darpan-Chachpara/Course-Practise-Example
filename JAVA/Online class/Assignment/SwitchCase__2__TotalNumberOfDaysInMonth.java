package Assignment;

import java.util.Scanner;

public class SwitchCase__2__TotalNumberOfDaysInMonth
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER BETWEEN (1 TO 12)");
		int monthnum=sc.nextInt();
		
		switch(monthnum)
		{
		case 1:
			System.out.println("\n JANUARY 31 DAYS");
			break;
		case 2:
			System.out.println("\n FEBRUARY 28 OR 29 DAYS");
			break;
		case 3:
			System.out.println("\n MARCH 31 DAYS");
			break;
		case 4:
			System.out.println("\n APRIL 30 DAYS");
			break;
		case 5:
			System.out.println("\n MAY 31 DAYS ");
			break;
		case 6:
			System.out.println("\n JUNE 30 DAYS");
			break;
		case 7:
			System.out.println("\n JULY 31 DAYS");
			break;
		case 8:
			System.out.println("\n AUGUST 31 DAYS");
			break;
		case 9:
			System.out.println("\n SEPTEMBER 30 DAYS");
			break;
		case 10:
			System.out.println("\n OCTOBER 31 DAYS");
			break;
		case 11:
			System.out.println("\n NOVEMBER 30 DAYS");
			break;
		case 12:
			System.out.println("\n DECEMBER 31 DAYS");
			break;
			default :
				System.out.println("\n WRONG INPUT PLEASE CHECK THE NUMBER YOU HAVE TO INPUT");
			
		}
		sc.close();
	}

}
