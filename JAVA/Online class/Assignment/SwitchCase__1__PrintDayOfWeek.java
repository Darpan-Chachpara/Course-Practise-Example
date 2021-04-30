package Assignment;

import java.util.Scanner;

public class SwitchCase__1__PrintDayOfWeek 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER BETWEEN (1 TO 7)");
		int num=sc.nextInt();
		
		switch(num)
		{
		case 1:
			System.out.println("\nSUNDAY");
			break;
		case 2:
			System.out.println("\nMONDAY");
			break;
		case 3:
			System.out.println("\nTUESDAY");
			break;
		case 4:
			System.out.println("\nWEDNESDAY");
			break;
		case 5:
			System.out.println("\nTHRUSDAY");
			break;
		case 6:
			System.out.println("\nFRIDAY");
			break;
		case 7:
			System.out.println("\nSATURDAY");
			break;
			default :
				System.out.println("\nWRONG INPUT PLEASE CHECK THE NUMBER YOU HAVE TO INPUT");
			
		}
		sc.close();
	}

}
