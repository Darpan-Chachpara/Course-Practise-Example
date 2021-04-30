package Assignment;

import java.util.Scanner;

public class Loop_2_AllNaturalNumberInReverseFromNto1 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int num=sc.nextInt();
		System.out.println("NATURAL NUMBER IN REVERSE ORDER ARE :");
		int i=1;
		while(i<=num)
		{
			System.out.println(""+((num+1)-i));
			i++;
		}
	}

}
