package bank.account;

public class InvalidAccountException extends Exception
{
	String statement;

	public InvalidAccountException(String statement) 
	{
		this.statement = statement;
	}
	
}
