package lectutre.CoreJavaAssignment;

class ThreadAccount
{
	int acno, balance;
	
	public void setAcno(int acno) 
	{
		this.acno = acno;
	}
	public int getAcno() 
	{
		return acno;
	}

	
	public void setBalance(int balance) 
	{
		this.balance = balance;
	}
	public int getBalance()
	{
		return balance;
	}
	
	 public void withdrawAmt(int bal){
	        balance= balance-bal;
	    }

	    public void depositAmt(int bal){
	        balance= balance+bal;
	    }

	
	
}

public class Assignment_14_8_9_DepositWithdrow implements Runnable
{
	ThreadAccount acc =new ThreadAccount();
	public void run()
	{
		for (int i = 0; i < 3; i++) 
	{
		Withdrow(1001,100);
       	     	if (acc.getBalance() < 0)
            {
                System.out.println("account is overdrawn!");
            }
            deposit(100);
        }
	}
	public static void main(String[] args)
	{
		Assignment_14_8_9_DepositWithdrow tw =new Assignment_14_8_9_DepositWithdrow();
		Thread t1 =new Thread(tw ,"DARPAN");
		t1.start();
		
	}
	public synchronized void Withdrow(int acno , int bal)
	{
		if(acc.getBalance()>=bal)
		{
			System.out.println(Thread.currentThread().getName()+ " is trying to withdrow.");
		
			try 
			{
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			acc.withdrawAmt(bal);
			System.out.println(Thread.currentThread().getName()+" "+ "is complete the withdraw");
		}
		else
		{        
			System.out.println(Thread.currentThread().getName()+ " "+"doesn't have enough money for withdraw ");
		}
		
	}
	
	
	 private synchronized void deposit(int bal){
	        
	            System.out.println(Thread.currentThread().getName()+" "+ " is try to deposit");
	            try
{
	               Thread.sleep(100);
	            } 
	            catch (Exception e)
	            {
	                e.printStackTrace();
	            }
	            acc.depositAmt(bal);
	            System.out.println(Thread.currentThread().getName()+" "+ "is complete the deposit");
	       
	    }

}
