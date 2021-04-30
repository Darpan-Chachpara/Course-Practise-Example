package lectutre;

public class NestedTRY_CATCH 
{

	public static void main(String[] args)
	{
		try 		//Parent try block

		{
			try     //child try block1
			{
				System.out.println("XYZ");
				int b=45/0;
				System.out.println(b);
			}
			catch(ArithmeticException e1)
			{
				System.out.println("DONE XYZ");
			}
			try //child try block2
			{
				System.out.println("ABC");
				int b=45/0;
				System.out.println("b");
			}
			catch(ArrayIndexOutOfBoundsException e2)
			{
				System.out.println("DONE ABC");
			}
			System.out.println("NEW ABC");
		}//end of main try
		
		catch(ArithmeticException e3)
		{
			System.out.println("MNO");
			System.out.println("WELCOME MNO");
		}
		catch(ArrayIndexOutOfBoundsException e3)
		{
			System.out.println("LMO");
			System.out.println("WELCOME LMO");
		}
		catch(Exception e5)
		{
			System.out.println("PQR");
			System.out.println("WELCOME PQR");
		}
		System.out.println("FINALLY U CAN LEAVE");
	}

}
