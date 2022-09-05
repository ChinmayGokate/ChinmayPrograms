package bank.account;

public class NegativeAmountException extends Exception
{
	//String statement;

	public NegativeAmountException(String statement) 
	{
		super(statement);
		//this.statement = statement;
	}
	
}
