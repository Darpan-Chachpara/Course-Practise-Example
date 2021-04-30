public class WorkingOfStaticFunction 
{
	static int i=10;
	static void msg()
	{
		System.out.println("MSG");
	}

	public static void main(String[] args)
	{
		//direct way of calling
		WorkingOfStaticFunction.msg();
		System.out.println(WorkingOfStaticFunction.i);
		
		//Creating object and calling
		WorkingOfStaticFunction s=new WorkingOfStaticFunction();
		System.out.println(s.i);
		s.msg();
	}

}






