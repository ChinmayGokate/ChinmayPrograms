package bank.account;

public class InsufficientFundsException extends Exception
{
	//String statement;

	public InsufficientFundsException(String statement) 
	{	super(statement);
		//this.statement = statement;
	}
}
