package Assignment;

import java.util.Scanner;

public class SwitchCase__6__NumberIsPositiveNegativeZero {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		double num=sc.nextDouble();
		switch(num>0)
		{
		case 1:
			System.out.println("\n "+num+" NUMBER IS POSITIVE");
			break;
		case 0:
			switch(num<0)
			{
			case 1:
				System.out.println("\n NUMBER IS NEGATIVE");
				break;
			case 0:
				System.out.println("\n NUMBER IS ZERO");
			}
		}

	}

}
