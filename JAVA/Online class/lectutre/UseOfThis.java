package lectutre;

public class UseOfThis {

	public static void main(String[] args) 
	{
		Demo2 ob=new Demo2(5);
		ob.print();
	}

}

// as calling the method using (this) the object can be called directly
class Demo2
{
	int i;
	Demo2(int i)
	{
		this.i=i;
		System.out.println("local variable "+i);
	}
	void print()
	{
		System.out.println("print instance variable "+i);
	}
	}

/*
// in print part the value will be (0) as the instance is converted into local and the preference is given to local
class Demo2
{
	int i;
	Demo2(int ii)
	{
		i=ii;
		System.out.println("local variable "+i);
	}
	void print()
	{
		System.out.println("print instance variable "+i);
	}
	
	
// there will be no change in output as directly the instance value is pass
class Demo2
{
	int i;
	Demo2(int i)
	{
		i=i;
		System.out.println("local variable "+i);
	}
	void print()
	{
		System.out.println("print instance variable "+i);
	}
	}
*/