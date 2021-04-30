
public class Constructor
{

	public static void main(String[] args) 
	{
		C c=new C();
		
		// new C();
		
	}
}


//void class A == Then it is called as method
class A     // called as constructor
{
	A()
	{
		System.out.println("IN A CTR...");
	}
}

class B extends A
{
	B()
	{
		System.out.println("IN B CTR...");
	}
}

class C extends B
{
	C()
	{
		System.out.println("IN C CTR...");
	}
}