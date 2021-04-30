package Assignment;

import java.util.Scanner;

public class Loop_14_SumOfDigitOfNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int num=sc.nextInt();
		int sum=0,result;
		while(num!=0)
		{
			result=num%10;    // if not use result
			sum=sum+result;  //(sum=sum+(num%10))
			num=num/10;
		}
		System.out.println("\n SUM OF THE DIGIT = "+sum);
	}

}
