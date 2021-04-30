package Assignment;

import java.util.Scanner;

public class Loop_11_FirstAndLastDigitNumber
{

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
		System.out.println("\n FIRST DIGIT OF A NUMBER IS : "+first);
		System.out.println("\n LAST DIGIT OF A NUMBER IS : "+last);

	}

}
