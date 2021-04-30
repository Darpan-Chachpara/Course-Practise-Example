import java.util.Scanner;

public class Demo 
{
	int i;    // Variable
	void meth()   //Method
	{
		System.out.println("AS DEVELOPER");
	}
	public static void main(String args[])
	{
		Demo ob1=new Demo();
		ob1.meth();
		ob1.i=10;
		System.out.println(ob1.i);
		
		Demo ob2=new Demo();
		ob2.i=100;
		ob2.meth();
		System.out.println(ob2.i);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER");
		int a=sc.nextInt();
		System.out.println("ENTER THE SECOND NUMBER");
		int b=sc.nextInt();
		System.out.println("THE SUM OF FIRST AND SECOND NUMBER IS");
		int sum=a+b;
		System.out.println(sum);
		sc.close();
		
		
		// FOR INTEGER (int a=sc.nextInt();)
		// FOR STRING  (string name=sc.next();)
		// FOR FLOAT   (float a=sc.mextfloat();)
		
	}
}
