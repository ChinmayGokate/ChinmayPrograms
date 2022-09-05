package bank1;

public class InsufficientBalanceException extends Exception
{
	public InsufficientBalanceException(String str)
	{
		super(str);
	}
}
