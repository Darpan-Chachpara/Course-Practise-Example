package lectutre.CoreJavaAssignment;

class ThreadMessage1 extends Thread
{
     String msg = "";
     ThreadMessage1(String msg)
     {
          this.msg = msg;
     }
     public void run()
     {
          try
          {
               while (true)
               {
                    System.out.println(msg);
                    Thread.sleep(300);
               }
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}


class ThreadMessage2 extends Thread
{
     String msg = "";
     ThreadMessage2(String msg)
     {
          this.msg = msg;
     }
     public void run()
     {
          try
          {
               while (true)
               {
                    System.out.println(msg);
                    Thread.sleep(400);
               }
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
     
}

public class Assignment_14_3_ThreadMessage
{
	public static void main(String[] args)
	{
		ThreadMessage1 t1 = new ThreadMessage1("Running Thread1....");
   	 	ThreadMessage2 t2 = new ThreadMessage2("Running Thread2....");
         t1.start();
         t2.start();
	}

}
