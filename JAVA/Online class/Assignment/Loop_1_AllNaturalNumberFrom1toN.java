package Assignment;

import java.util.Scanner;

public class Loop_1_AllNaturalNumberFrom1toN
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int num=sc.nextInt();
		System.out.println("NATURAL NUMBER ARE : ");
		int i=1;
		while(i<=num)
		{
			System.out.println(+i);
			i++;
		}
	}

}
