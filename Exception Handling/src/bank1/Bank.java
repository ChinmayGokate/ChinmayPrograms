package bank1;

public class Bank 
{	
	void withdraw(double currentBalance,double withdrawalAmount ) throws InsufficientBalanceException, MaintainMinimumBalanceException
	{
		if(currentBalance>1000)
		{
			currentBalance=currentBalance-withdrawalAmount;
			if(currentBalance>=1000)
			{
				System.out.println("Transaction Successful");
				System.out.println("Available Balance : "+currentBalance);
			}
			else
			{
				throw new MaintainMinimumBalanceException("Must maintain Rs.1000 as minimum balance in account");
			}
			
		}
		else
		{
			throw new InsufficientBalanceException("You have insufficient balance in your account");
		}
	}

}
