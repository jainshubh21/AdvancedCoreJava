
public class RunnableTargetDemo implements Runnable 
{
	@Override
	public void run()
	{
		for(int i=0 ; i<10 ; i++)
		{
		System.out.println(Thread.currentThread().getName()+":::"+i);
		}
	}
	
	public static void main(String arg[])
	{
		RunnableTargetDemo rtd = new RunnableTargetDemo();
		
		Thread child1 = new Thread(rtd);
		Thread child2 = new Thread(rtd);
		child1.setName("ABC");
		child2.setName("DEF");
		
		child1.start();
		child2.start();
	}

}
