package lectutre.CoreJavaAssignment;

import java.util.Scanner;

public class Assignment_1_6_SumOfDigit 
{

	public static void main(String[] args)
	{
		int num,m,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		num=sc.nextInt();
		sc.close();
		while(num>0)
		{
			m=num%10;
			sum=sum+m;
			num=num/10;
		}
		System.out.println("SUM OF DIGIT : "+sum);
	}

}
