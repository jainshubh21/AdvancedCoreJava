
public class BankingException extends Exception 
{
	public BankingException()
	{
		super("Balance amount is not sufficient");
	}
	
	public String toString()
	{
		return "Balance is not Sufficient";
	}
	

}
