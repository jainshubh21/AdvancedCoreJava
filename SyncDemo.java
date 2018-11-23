
public class SyncDemo extends Thread 
{
	public synchronized static void Withdraw(String process[])
	{
		for(int i=0;i<process.length;i++)
		{
			System.out.println(Thread.currentThread().getName()+":::"+process[i]);
		}
	}
	

}
