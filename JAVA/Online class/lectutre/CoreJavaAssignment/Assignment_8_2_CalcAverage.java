package lectutre.CoreJavaAssignment;

import java.util.Scanner;

class CalAverage 
{
	public double avgFirstN(int n)
	{
		if(n<0)
		{
			throw new IllegalArgumentException("value must be non-negative...");
		}
		double sum=0;
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		double avg=sum/n;
		return avg;
	}
	
}


public class Assignment_8_2_CalcAverage 
{

	public static void main(String[] args)
	{
		CalAverage c=new CalAverage();
		System.out.println("Enter Any Natural Number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		double res=c.avgFirstN(num);
		System.out.println("Average is:"+res);
	}

}
