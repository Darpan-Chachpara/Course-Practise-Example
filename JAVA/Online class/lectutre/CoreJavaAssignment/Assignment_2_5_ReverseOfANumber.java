package lectutre.CoreJavaAssignment;

import java.util.Scanner;

public class Assignment_2_5_ReverseOfANumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int num=sc.nextInt();
		int reverse=0,digit;
		
		while(num!=0)
		{
			digit= num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		System.out.println("REVERSE NUMBER : "+reverse);
	sc.close();
	}

}
