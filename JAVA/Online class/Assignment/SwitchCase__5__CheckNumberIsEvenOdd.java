package Assignment;

import java.util.Scanner;

public class SwitchCase__5__CheckNumberIsEvenOdd 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int num=sc.nextInt();
		switch(num % 2)
		{
		case 0:
			System.out.println("\n "+num+" NUMBER IS EVEN");
			break;
		case 1:
			System.out.println("\n "+num+" NUMBER IS ODD");
			break;	
		}
		sc.close();
	}

}
