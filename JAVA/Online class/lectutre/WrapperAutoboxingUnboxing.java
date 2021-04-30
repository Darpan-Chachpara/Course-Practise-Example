package lectutre;

public class WrapperAutoboxingUnboxing 
{

	public static void main(String[] args) 
	{
		
		int x=100;   //not a object
		System.out.println(x); //Primitive
		
		Integer y=new Integer(x);  //object
		System.out.println(y);  //Unboxing
		
		int z=y.intValue();
		System.out.println(z);
		
		Integer a=new Integer(10);
		Integer b=new Integer(20);
		int c=a+b;
		System.out.println(c);
		
		
		
		//Another way
		int d=80;
		//Autoboxing
		Integer aObj=d; //not needed Integer y=new Integer(x);
		//Unboxing
		int a1=aObj;  //not needed int z=y.intValue();
		}

}
