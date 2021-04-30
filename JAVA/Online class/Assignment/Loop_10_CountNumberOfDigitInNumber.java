package Assignment;

import java.util.Scanner;

public class Loop_10_CountNumberOfDigitInNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int num=sc.nextInt();
		int count=0;
		while(num!=0)//(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("\n NUMBER OF DIGIT : "+count);
	}

}
