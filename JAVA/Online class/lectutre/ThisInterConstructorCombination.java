 package lectutre;

public class ThisInterConstructorCombination 
{

	public static void main(String[] args) 
	{
		D ob=new D(10,20);
	}
}
class D
 
{
	D()
	{
		System.out.println("empty");
	}
	D(int a)
	{
		this();
		System.out.println(a);
	}
	D(int a,int b)
	{
		this(a);
		System.out.println(a+" "+b);
	}
	
}