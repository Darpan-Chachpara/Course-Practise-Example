package lectutre.CoreJavaAssignment;

import java.util.Scanner;

class IncorrectAgeException extends Exception
{
	IncorrectAgeException(String str)
	{
		super(str);
	}
	public String tostring()
	{
		return "Candidate is less than 18 year is not allowed to vote...";
	}
}
class IncorrectNationalityException extends Exception
{
	IncorrectNationalityException(String str)
	{
		super(str);
	}
	public String tostring()
	{
		return "Candidate of other nation than India is not allowed to vote...";
	}
}
class Voter 
{
	int age;
	String nation;
	
	 void ValidateAge(int age)throws IncorrectAgeException
	{
		if(age<18)
		{
			throw new IncorrectAgeException("Invalid Candidate...Candidate is less than 18 year  not allowed to vote...");
		}
		else
		{
			System.out.println("You are allowed for voting...");
		}
	}
	 
	 void ValidateNationality(String nation)throws IncorrectNationalityException
	 {
		 if(nation!="Indian")
		 {
			 throw new IncorrectNationalityException("Invalid Candidate...Candidate other than India is not allowed to vote...");
		 }
		 else
		 {
			 System.out.println("Welcome  To Vote.....");
		 }
	 }
}

public class Assignment_8_5_Voting 
{

	public static void main(String[] args) 
	{
		System.out.println("ENTER YOUR NAME");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("ENTER YOUR AGE");
		int num=sc.nextInt();
		System.out.println("ENTER YOUR NATIONALITY");
		String s1=sc.next();
		
		Voter v=new Voter();
		try
		{
			v.ValidateAge(num);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		try
		{
			v.ValidateNationality("Indian");
		}
		catch(Exception ex2)
		{
			System.out.println(ex2);
		}
	}

}
