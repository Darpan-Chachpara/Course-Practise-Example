package lectutre;

public class UseOfSuper
{

	public static void main(String[] args)
	{
		B ob=new B(10,20);
	}
}
class B extends A
{
	B(int i,int j)
	{
		//if super is not return then only empty will execute
		super(i,j);
		//super(a,b); for calling two parameter
		int sum=i+j;
		System.out.println("in B ctr "+sum);
	}
}
class A
{
	A()
	{
		System.out.println("empty");
	}
	A(int i)
	{
		System.out.println("one "+i);
	}
	A(int i,int j)
	{
		System.out.println("two "+i+" "+j+"");
	}
}