package bank1;

public class Testing 
{
	public static void main(String[] args) 
	{
		Bank b=new Bank();
		try {
			b.withdraw(150, 500);
		} catch (InsufficientBalanceException | MaintainMinimumBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
