package Assignment;

import java.util.Scanner;

public class Loop_4_AllOddNumberTill_N
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int num=sc.nextInt();
		System.out.println("ODD NUMBER IN THE SERIES ARE : ");
		for (int i=1;i<=num;i++)
		{
			if(i%2!=0)
			{
				System.out.println(+i);
			}
		}
	}

}
