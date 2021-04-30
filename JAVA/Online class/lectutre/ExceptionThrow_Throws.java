package lectutre;

public class ExceptionThrow_Throws {

	public static void main(String[] args)
	{
		try
		{
			Rock ob=new Rock();
			ob.display();	
		}
		catch(ssiexception e)
		{
			System.out.println("Opps : "+e);
		}
	}

}
class ssiexception extends Exception
{
	ssiexception(String str)
	{
		super(str);
	}
}
class Rock
{
	void display() throws ssiexception
	{
		ssiexception ob=new ssiexception("ABCDEFG");
		throw ob;
	}
}