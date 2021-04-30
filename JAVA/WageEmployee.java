import java.util.Scanner;

class Employee
{ 
	int hrs ,rate ,empId;
	String name;
	
	
	Employee()
	{
	name=null;
	hrs =0;
	rate =0;
	}
	
	Employee(String n, int hr , int rate, int empID)
	{
	name=n;
	hrs =hr;
	this.rate =rate;
	empId =empID;
	}
	
	public void show(String name ,int id )
	{
		System.out.println("Employee ID : " +id);
		System.out.println("Employee Name : " +name);
		
	}
	public void computeSalary(int hr , int rate)
	{
		
		System.out.println("Salary " + hr*rate);
	}
}
public class WageEmployee extends Employee
{

	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter employee Id :");
		int id = s.nextInt();
		
		System.out.println("Enter name :");
		String name = s.next();
		
		System.out.println("Enter working hours :");
		int hour = s.nextInt();
		
		System.out.println("Enter rate in per hour :");
		int rate = s.nextInt();
		WageEmployee wg =new WageEmployee();
		wg.show(name,id);
		wg.computeSalary(hour, rate);		
	}
}

class SalesPerson extends Employee
{
	int sale ;
	int commision;
	
	public void computeSalary(int sale , int commision)
	{
		
		System.out.println("Commission ");
	}
	
}
