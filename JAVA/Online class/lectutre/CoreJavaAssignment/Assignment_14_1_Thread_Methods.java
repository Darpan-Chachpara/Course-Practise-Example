package lectutre.CoreJavaAssignment;

public class Assignment_14_1_Thread_Methods extends Thread
{

	public void run()
	{
		System.out.println("hello");
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("After sleep .");
	}
	public static void main(String[] args)
	{
		Assignment_14_1_Thread_Methods t1 = new Assignment_14_1_Thread_Methods();
		System.out.println("t1 thread priority :"+t1.getPriority());
		Assignment_14_1_Thread_Methods t2 = new Assignment_14_1_Thread_Methods();
		System.out.println("t2 thread priority :"+t2.getPriority());
		
		
	    t2.setPriority(MAX_PRIORITY);
		System.out.println("t2 thread priority :"+t2.getPriority());

		
		
		System.out.println("RUNNING THREAD IS :" +Thread.currentThread().getName());
		System.out.println(t1.isAlive());
		
		t1.start();
		System.out.println(t1.isAlive());
		try
		{
			t1.join();// wait for t1 to finish
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		t2.start();
	}

}
