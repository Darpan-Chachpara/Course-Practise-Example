package Assignment;

import java.util.Scanner;

public class IfElse__19__EnterMarksCalculatePercentageGrade
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE MARKS OF FIRST SUBJECT : ");
		double sub1=sc.nextDouble();
		System.out.println("ENTER THE MARKS OF SECOND SUBJECT : ");
		double sub2=sc.nextDouble();
		System.out.println("ENTER THE MARKS OF THIRD SUBJECT : ");
		double sub3=sc.nextDouble();
		System.out.println("ENTER THE MARKS OF FOURTH SUBJECT : ");
		double sub4=sc.nextDouble();
		System.out.println("ENTER THE MARKS OF FIFTH SUBJECT : ");
		double sub5=sc.nextDouble();
		
		double average=(sub1+sub2+sub3+sub4+sub5)/5;
		System.out.println("PERCENTAGE = "+average);
		
		if(average>=90)
		{
			System.out.println("AVERAGE IS "+average+" SO GRADE IS A");
		}
		else if(average>=80)
		{
			System.out.println("AVERAGE IS "+average+" SO GRADE IS B");
		}
		else if(average>=70)
		{
			System.out.println("AVERAGE IS "+average+" SO GRADE IS C");
		}
		else if(average>=60)
		{
			System.out.println("AVERAGE IS "+average+" SO GRADE IS D");
		}
		else if(average>=40)
		{
			System.out.println("AVERAGE IS "+average+" SO GRADE IS E");
		}
		else if(average<40)
		{
			System.out.println("AVERAGE IS "+average+" SO GRADE IS F (FAIL!)");
		}
		sc.close();
		
	}

}
