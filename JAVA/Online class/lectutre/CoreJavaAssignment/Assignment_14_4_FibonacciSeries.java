package lectutre.CoreJavaAssignment;

import java.util.Scanner;

class Fibonaci extends Thread
{
	 public void run()
	 {
		 try
			{
				int n1=0,n2=1 ,n3=0,n=10;
				
				Scanner s =new Scanner(System.in);
				System.out.println(" ");
				System.out.println("Enter no to find fibonaci series :");
				n =s.nextInt();
				System.out.println();
				System.out.println("Fibonaci Series :");
				while(n>0)
				{
					System.out.print(n3+ " ");
					n1=n2;
					n2=n3;
					n3 =n1+n2;
					n--;
					
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	 }
	
}

class Reverse extends Thread
{
	 public void run()
	 {
		 try
			{
				int i;
				
				System.out.println("Reverse Number :");
				for(i=10;i>=1;i--)
				{
					System.out.print(i+"   ");
				}
				System.out.println();

			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	 }
	
}

public class Assignment_14_4_FibonacciSeries 
{
	public static void main(String[] args) 
	{
		   try
	          {
			   Reverse r = new Reverse();
				r.start();
				r.sleep(400);
				
				Fibonaci f = new Fibonaci();
				f.start();
				
	          }
	          catch (Exception ex)
	          {
	               ex.printStackTrace();
	          }

	}

}
