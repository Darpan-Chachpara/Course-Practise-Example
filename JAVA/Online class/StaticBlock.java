
public class StaticBlock 
{
static
{
	System.out.println("IN STATIC INITIALIZE (1)");
}
	public static void main(String[] args)
	{
		System.out.println("IN MAIN");
	}
static
{
	System.out.println("IN STATIC INITIALIZE (2)");
}
}
