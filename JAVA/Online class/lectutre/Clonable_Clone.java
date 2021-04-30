package lectutre;

public class Clonable_Clone implements Cloneable
{
	void meth()
	{
		System.out.println("HELLO WELCOME");
	}

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Clonable_Clone c1=new Clonable_Clone();
		Clonable_Clone c2=(Clonable_Clone)c1.clone();
		System.out.println(c1);
		System.out.println(c2);
		c1.meth();
		c2.meth();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());

}

}
