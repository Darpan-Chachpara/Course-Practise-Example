package Assignment;

import java.util.Scanner;

public class Loop_8_SumOfAllOddNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int num=sc.nextInt();
		int sum=0;
		System.out.println("\nSUM OF ALL ODD NUMBER ARE : ");
		for(int i=1;i<=num;i=i+2)
		{
				sum=sum+i;
		}
		System.out.println(+sum);

	}

}
/*
for(int i=1;i<=num;i++)
{
	if(i%2!=0)
	{
	sum=sum+i;
	}

}
*/