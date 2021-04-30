package Assignment;

import java.util.Scanner;

public class Loop_6_SumOfAllNaturalNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			 sum=sum+i;
		}
		System.out.println("\n SUM OF NATURAL NUMBER ARE : "+sum);
		
	}

}
