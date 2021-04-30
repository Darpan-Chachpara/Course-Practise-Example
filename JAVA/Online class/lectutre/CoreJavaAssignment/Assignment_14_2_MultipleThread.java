package lectutre.CoreJavaAssignment;

public class Assignment_14_2_MultipleThread implements Runnable
{
	public void run()
	{
		System.out.println("NAME OF THE RUNNING THREAD : -"+Thread.currentThread().getName());
	}

	public static void main(String[] args) throws Exception
	{
		Assignment_14_2_MultipleThread t1 = new  Assignment_14_2_MultipleThread();
		Thread thread1 =new Thread(t1);
		thread1.start();
		
		Assignment_14_2_MultipleThread t2 = new  Assignment_14_2_MultipleThread();
		Thread thread2 =new Thread(t2);
		thread2.start();
		
		Assignment_14_2_MultipleThread t3 = new  Assignment_14_2_MultipleThread();
		Thread thread3 =new Thread(t3);
		thread3.start();
		
		Assignment_14_2_MultipleThread t4 = new  Assignment_14_2_MultipleThread();
		Thread thread4 =new Thread(t4);
		thread4.start();
	}

}
