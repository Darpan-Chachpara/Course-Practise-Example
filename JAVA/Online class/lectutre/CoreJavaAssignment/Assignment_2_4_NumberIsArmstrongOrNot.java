package lectutre.CoreJavaAssignment;

import java.util.Scanner;

public class Assignment_2_4_NumberIsArmstrongOrNot 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int num=sc.nextInt();
		int temp,count=0,a;
		temp=num;
		while(num>0)
		{
			a=num%10;
			num=num/10;
			count=count+(a*a*a);

		}
		if(temp==count)
		{
			System.out.println("\n THE NUMBER "+temp+" IS AN ARMSTRONG NUMBER");
		}
		else
		{
			System.out.println("\n THE NUMBER "+temp+" IS NOT AN ARMSTRONG NUMBER");
		}
		sc.close();
	}

}
