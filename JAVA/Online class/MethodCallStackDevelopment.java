
public class MethodCallStackDevelopment 
{
	public static void main(String[] args)
	{
		System.out.println("ENTER MAIN ()");
		methodA();
		System.out.println("EXIT MAIN ()");
	}
	
	public static void methodA()
	{
		System.out.println("ENTER METHOD A()");
		methodB();
		System.out.println("EXIT METHOD A()");
	}
	
	public static void methodB()
	{
		System.out.println("ENTER METHOD B()");
		methodC();
		System.out.println("EXIT METHOD B()");
	}

	public static void methodC()
	{
		System.out.println("ENTER METHOD C()");
		System.out.println(1/0);
		System.out.println("EXIT METHOD C()");
	}
}
