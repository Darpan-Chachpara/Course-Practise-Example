import java.util.Scanner;

public class ADDITION 
{
	public static void main(String[]args)
	{
	int i,sum=0,num1,num2,num3,num4,num5;
	Scanner sc=new Scanner(System.in);

	System.out.println("ENTER THE FIRST VALUE");
	num1=sc.nextInt();
	System.out.println("ENTER THE SECOND VALUE");
	num2=sc.nextInt();
	System.out.println("ENTER THE THIRD VALUE");
	num3=sc.nextInt();
	System.out.println("ENTER THE FOURTH VALUE");
	num4=sc.nextInt();
	System.out.println("ENTER THE FIFTH VALUE");
	num5=sc.nextInt();
	

	
	
	sum=num1+num2+num3+num4+num5;
	for(i=0;i<sum;i++)
	{
	}
	System.out.println(" SUM OF ENTERED NUMBER = "+sum);
	}
}

