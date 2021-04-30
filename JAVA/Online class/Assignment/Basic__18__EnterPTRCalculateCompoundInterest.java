package Assignment;

import java.util.Scanner;

public class Basic__18__EnterPTRCalculateCompoundInterest
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER PRINCIPLE : ");
		double p=sc.nextDouble();
		System.out.println("ENTER RATE : ");
		double r=sc.nextDouble();
		System.out.println("ENTER TIME : ");
		double t=sc.nextDouble();
		
		double CI=p*(Math.pow((1+r/100),t));
		System.out.println("\nCOMPOUND INTEREST IS : "+CI);
		sc.close();
	}

}
