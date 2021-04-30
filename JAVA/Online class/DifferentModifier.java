
public class DifferentModifier
{
	 void meth1()
	{
		System.out.println("\nIM HERE!\n");
	}
	
	
	int meth2(int i)
	{
	return i+10;
	}
	
	void meth3(int array[])
	{
		System.out.println(array[2]);
		System.out.println("");
	}
	
	String []meth4()
	{
		String strarray[]= {"XYZ","ABC","PQR","LMO"};
		return strarray;
	}
	
	
	
	public static void main(String args[])
	{
	DifferentModifier d=new DifferentModifier();
	
	d.meth1();
	
	int c=d.meth2(1000);
	System.out.println(c+"\n");
	
	int array[]= {100,200,300,400,500};
	d.meth3(array);
	
	String str[]=d.meth4();
	System.out.println(str[2]);
}
}
