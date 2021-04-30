package Assignment;

import java.util.Scanner;

public class Loop_12_SumOfFirstAndLastDigitNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int num=sc.nextInt();
		int last,first;
		
		last=num%10;
		while(num>10)
		{
			num=num/10;
		}
		first=num;
		int sum=first+last;
		System.out.println("\n SUM OF FIRST AND LAST DIGIT OF THE NUMBER IS : "+sum);
	}

}
