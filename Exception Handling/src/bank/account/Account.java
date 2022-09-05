package bank.account;
/*An Account class is given to you. The attributes of the Account which are accountNumber and balance,
 the getters/setters and a constructor are defined.*/
public class Account 
{
	int accountNumber=107;
	double balance=10000.0;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
//	public Account(int accountNumber, double balance) {
//		super();
//		this.accountNumber = accountNumber;
//		this.balance = balance;
//	}
	
	
	
}
