package bank.account;

public class Account implements Runnable
{
	int balance=10000;
	@Override
	public synchronized void run() 
	{
		deposit(5000);
		withdraw(4000);
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+i);
		}
		System.out.println(Thread.currentThread().getName()+balance);
	}
	void deposit(int amount)
	{
		balance=balance+amount;
	}
	void withdraw(int amount)
	{
		balance=balance-amount;
	}
}
