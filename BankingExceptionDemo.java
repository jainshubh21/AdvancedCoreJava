
public class BankingExceptionDemo 
{
	int balance = 1000;
	
	public void Withdraw(int amount)throws BankingException
	{
	
		if((balance-amount)<500)
			throw new BankingException();
		else
			System.out.println("Transaction Successful");
	
	}
	
	public static void main(String arg[])
	{
		BankingExceptionDemo obj = new BankingExceptionDemo();
		try
		{
			obj.Withdraw(700);
		}
		catch(BankingException b)
		{
			System.out.println("Baning Exception Arised: "+b);
		}
		
		
	}

}
