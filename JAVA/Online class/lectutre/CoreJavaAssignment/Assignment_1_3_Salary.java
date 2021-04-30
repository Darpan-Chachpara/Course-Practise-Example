package lectutre.CoreJavaAssignment;

import java.util.Scanner;

public class Assignment_1_3_Salary 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE BASIC SALARY : ");
		int basic=sc.nextInt();
		float hra=(float)(0.30*basic);
		float da =(float) (0.20*basic);
		  float gross = hra + da + basic ;
		  float tax = 0;

		  if(basic>0 && basic<4000)
		  {
		   tax = (float) 0.04;
		  }
		  else if(basic>=4000 && basic<10000)
		  {
		   tax = (float) 0.06;
		  }
		  else if(basic>=10000 && basic<17000)
		  {
		   tax = (float) 0.08;
		  }
		  else if(basic>=17000 && basic<27000)
		  {
		   tax = (float) 0.1;
		  }
			
		  else if(basic>27000)
		  {
		   tax = (float)0.15;
		  } 
		  float incometax = gross* tax ;
		  System.out.println("GROSS SALARY " +gross);
		  System.out.println("INCOME TAX ON " +basic+ " IS " +incometax);
	}

}
