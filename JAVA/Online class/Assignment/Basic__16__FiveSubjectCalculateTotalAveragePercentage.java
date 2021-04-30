package Assignment;

import java.util.Scanner;

public class Basic__16__FiveSubjectCalculateTotalAveragePercentage
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE MARKS OF SUBJECT(1) : ");
		double sub1=sc.nextDouble();
		System.out.println("ENTER THE MARKS OF SUBJECT(2) : ");
		double sub2=sc.nextDouble();
		System.out.println("ENTER THE MARKS OF SUBJECT(3) : ");
		double sub3=sc.nextDouble();
		System.out.println("ENTER THE MARKS OF SUBJECT(4) : ");
		double sub4=sc.nextDouble();
		System.out.println("ENTER THE MARKS OF SUBJECT(5) : ");
		double sub5=sc.nextDouble();
		
		double total=sub1+sub2+sub3+sub4+sub5;
		double average=total/5;
		double percentage=(total/500)*100;
		
		System.out.println("TOTAL MARKS OF FIVE SUBJECT : "+total);
		System.out.println("AVERAGE MARKS OBTAINED : "+average);
		System.out.println("PERCENTAGE OBTAINED : "+percentage);
		sc.close();
	}

}
