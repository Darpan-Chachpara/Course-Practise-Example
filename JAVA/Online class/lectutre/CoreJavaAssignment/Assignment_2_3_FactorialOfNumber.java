package lectutre.CoreJavaAssignment;

import java.util.Scanner;

public class Assignment_2_3_FactorialOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER U WANT : ");
		int num=sc.nextInt();
		int i,fact=1;
		sc.close();
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("\n FACTORIALL OF '"+num+"' IS '"+fact+"'");
	}
}
