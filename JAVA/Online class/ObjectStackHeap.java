
class ObjectStackHeap 
{
	xyz meth5()
	{
		xyz a=new xyz();
		return a;
	}
	
	void meth6(xyz ob2)
	{
		ob2.meth2();
	}
	
	xyz []meth7()
	{
		xyz ob1=new xyz();
		xyz ob2=new xyz();
		xyz ob3=new xyz();

		xyz arr[]= {ob1,ob2,ob3,null};
		return arr;
	}
	
	public static void main(String[] args)
	{
		ObjectStackHeap d=new ObjectStackHeap();
		
		xyz a1=d.meth5();
		a1.meth1();
		
		xyz ob1=new xyz();
		d.meth6(ob1);
		
		xyz []arrayobj=d.meth7();
		arrayobj[1].meth3();
	}

}

class xyz
{
	void meth1()
	{
		System.out.println("\nHELLO GREAT JOB\n");
	}
	void meth2()
	{
		System.out.println("LOOKING GREAT\n");
	}
	void meth3()
	{
		System.out.println("AWSOME WORK");
	}
}