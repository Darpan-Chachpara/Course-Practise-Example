package Assignment;

import java.util.Scanner;

public class Loop_9_MultiplicationOfTable
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER FOR MULTIPLIED TABLES : ");
		int num=sc.nextInt();
		int i;
		System.out.println("\n MULTIPLICATION TABLE :");
		for(i=1;i<=12;i++)
		{
			//num=num*i;
			System.out.println(num+ " * " +i+" = "+(num*i));

		}

	}

}
