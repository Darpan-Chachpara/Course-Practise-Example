package Assignment;

import java.util.Scanner;

public class SwitchCase__4__MaximumBetweenTwoNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER : ");
		int num1=sc.nextInt();
		System.out.println("ENTER THE SECOND NUMBER : ");
		int num2=sc.nextInt();
		switch(num1>num2)
		{
		case 0:
			System.out.println("\n "+num2+">"+num1+" SO THE GREATER NUMBER IS "+num2);
			break;
		case 1:
			System.out.println("\n "+num1+">"+num2+" SO THE GREATER NUMBER IS "+num1);
			break;
			
			default :System.out.println("BOTH NUMBER ARE EQUAL");
				break;
		}
	}

}
