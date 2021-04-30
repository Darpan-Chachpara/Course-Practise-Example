package Assignment;

import java.util.Scanner;

public class Loop_7_SumOfEvenAllNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int num=sc.nextInt();
		int sum=0;
		System.out.println("\nSUM OF ALL EVEN NUMBER ARE : ");
		for(int i=2;i<=num;i=i+2)
		{
				sum=sum+i;
		}
		System.out.println(+sum);

		
	}

}
