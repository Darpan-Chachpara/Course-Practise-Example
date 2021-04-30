package lectutre.CoreJavaAssignment;

import java.util.Scanner;

public class Assignment_2_6_FibonacciSeries
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER HOW MANY FIBONACCI NUMBER TO PRINT :");
		int num=sc.nextInt();
		sc.close();
		int first=0,next=1,i,sum;
		System.out.println("THE FIRST '"+num+"' FIBONACCI NUMBER SERIES ARE :  ");
		System.out.println(first+"\n+"+next);
		for(i=1;i<=num-2;i++)
		{
			sum=first+next;
			first=next;
			next=sum;
			System.out.println("+"+sum);
		}
	}

}
