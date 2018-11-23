
public class ChildThreadDemo extends Thread 
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+":::"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Exception Arised:"+e);
			}
		}
	}	
			
			public static void main(String arg[])
			{
				ChildThreadDemo child1 = new ChildThreadDemo();
				ChildThreadDemo child2 = new ChildThreadDemo();
				
				child1.setName("Shubham");
				child2.setName("Irfan");
				
				child1.start();
				child2.start();
			}
	
	

}
