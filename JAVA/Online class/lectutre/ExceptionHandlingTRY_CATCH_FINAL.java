package lectutre;

public class ExceptionHandlingTRY_CATCH_FINAL
{

	public static void main(String[] args)
	{
		try
		{
			int c=10/2; 
//10\0=OPPS..java.lang.ArithmeticException: / by zero            (if 10/0 is used they catch will execute 
//ArithmeticException ob=new ArithmeticException();	             otherwise directly the next line will execute)
			System.out.println(c);
		}
		 catch(ArithmeticException e) //(Exception dc)
		 {
			 System.out.println("OPPS.."+e);
		 }
		finally
		{
			System.out.println("WELCOME ALL CLEAR");
		}
		
	}

}
