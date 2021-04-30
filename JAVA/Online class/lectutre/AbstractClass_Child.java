package lectutre;

class AbstractClass_Child extends Parents
{
	void meth()
	{
		System.out.println("I WAS ABSTRACT");
	}
	public static void main(String[] args) 
	{
		AbstractClass_Child c=new AbstractClass_Child();
		c.meth();
		c.conc();
	}

}

abstract class Parents
{
	abstract void meth();
	void conc()
	{
		System.out.println("CONC");
	}
}