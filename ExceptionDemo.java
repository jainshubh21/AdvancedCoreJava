
public class ExceptionDemo 
{
	public static void main(String arg[])
	{
		int var1 = 42 , var2 = 0 , result;
		
		try
		{
			result = var1/var2; //this statement may generate some exception.
			System.out.println("Result is:" +result);
		}
		catch(Exception e)
		{
			System.out.println("Arithmetic Expression occured:" +e);
		}
		finally
		{
			var2 = 3;
			result = var1/var2;
			System.out.println("Result is:"+result);
			System.out.println("Finally block");
		}
		
		System.out.println("After the code");
	}

}
