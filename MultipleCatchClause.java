
public class MultipleCatchClause 
{
	public static void main(String arg[])
	{
		int var1 = 50 , var2[] = {2,0,10} , result;
		try 
		{
			result = var1/var2[0];   //No Exception
			result = var1/var2[1];   //Arithmetic Exception
			result = var1/var2[2];   //No Exception
			result = var1/var2[3];   //Array Index Out of bound Exception
			
			System.out.println("Resut:"+result);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Arised:"+e);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("Arrayoutofbound Exception Arised:"+e1);
		}
		catch(Exception e2)
		{
			System.out.println("Global Exception Arised:"+e2);
		}
		
		
	}

}
