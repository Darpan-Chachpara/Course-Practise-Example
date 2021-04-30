package lectutre.CoreJavaAssignment;

interface Relational
{
	void greaterThan();
	void lessThan();
	void greaterThaneq();
	void lessThaneq();
}

class ImpRel implements Relational
{
	int a,b ;
	public ImpRel(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void greaterThan()
	{
		if(a>b) 
		{
			System.out.println(a+" is greter than  "+b);	
		}
		
	}
	
	public void lessThan()
	{
		if(a<b) 
		{
			System.out.println(a+" is less than  "+b);	
		}
	}
	
	public void greaterThaneq()
	{
		if(a>=b) 
		{
			System.out.println(a+" is greter than equals to "+b);	
		}
	}
	
	public void lessThaneq()
	{
		if(a<=b) 
		{
			System.out.println(a+" is less than equals to "+b);	
		}
	}
}

public class Assignment_7_1_RelationaDemo 
{
	public static void main(String[] args)
	{
		ImpRel d =new ImpRel(10,1);
		d.greaterThan();
		d.lessThan();
		d.greaterThaneq();
		d.lessThaneq();
	}
}
