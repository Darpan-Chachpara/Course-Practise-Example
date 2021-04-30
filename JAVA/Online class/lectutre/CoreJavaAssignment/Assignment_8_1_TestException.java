package lectutre.CoreJavaAssignment;

public class Assignment_8_1_TestException
{

	public static void main(String[] args) 
	{
		try
		{
			try
			{
				System.out.println("Inside trylock 1...");
				int a=20/0;
				System.out.println(a);
			}
			catch(ArithmeticException e1)
			{
				System.out.println("Exception:"+e1);
			}
			try
			{
				System.out.println("Inside tryblock 2....");
				int[] arr= {2,4,5,6};
				for(int i=0;i<=arr.length;i++)
					System.out.println(arr[i]);
			}
			catch(ArrayIndexOutOfBoundsException e2)
			{
				System.out.println("Exception:"+e2);
			}
			try
			{
				System.out.println("Inside tryblock 3....");
				Object o=null;
				o.toString();
			}
			catch(NullPointerException e3)
			{
				System.out.println("Exception:"+e3);
			}
			try
			{
				System.out.println("Inside tryblock 4......");
				int a=Integer.parseInt(null);
			}
			catch(NumberFormatException e4)
			{
				System.out.println("Exception:"+e4);
			}
			try
			{
				System.out.println("Inside tryblock 5.......");
				Class.forName("DarpanChachpara");
			}
			catch(ClassNotFoundException e5)
			{
				e5.printStackTrace();
			}
		}
		catch(Exception e6)
		{
			System.out.println("ExceptionMain:"+e6);
		}
		System.out.println("End of code....");

	}

}
