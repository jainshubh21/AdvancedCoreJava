
public class SynchronizeDemo extends Thread
{
	String str[] = {"Enter Name", "Enter Id", "Transaction", "Update", "Modify", "Delete"};
	//Thread child1 = new Thread();
	public void run()
	{
		SyncDemo.Withdraw(str);
	}
	
	public static void main(String arg[])
	{
		SynchronizeDemo sd = new SynchronizeDemo();
		SynchronizeDemo sd1 = new SynchronizeDemo();
		sd.setName("Shubham");
		sd.start();
		sd1.start();
	}

}
