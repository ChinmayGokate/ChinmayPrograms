package bank.account;

import java.util.Scanner;

/*A class AccountManager is given to you. In this class define the following three methods:

Method: checkAccount(int AccountNo): this method should use the list in the AccountList class to find out if the given account number exists in the list.
 If yes, return true, if it doesn’t exist, return false

Method: deposit(int accountNo,double amount): In this method get the balance of the account whose account number is passed as parameter.
 Add the given amount and the balance in the account and return the resulting new balance. If the account number doesn’t exist, throw a InvalidAccountException.
 If the amount given is negative, throw a NegativeAmountException.

Method: withdraw(int acountNo,double amount): In this method get the balance of the account whose account number is passed as parameter.
 Subtract the given amount from the balance and return the new balance. If the account number doesn’t exist, throw a InvalidAccountException.
 If the amount given is negative, throw a NegativeAmountException. If the amount to withdraw is more than the existing balance, throw a InsufficientFundException.
*/
public class AccountManager 
{
	AccountList al=new AccountList();
	//Account a=new Account(107, 10000);
	Account a=new Account();
	
	boolean checkAccount(int accountNo)
	{
		if(al.getList(a)==accountNo)
		return true;
		return false;
	}
	double deposit(int accountNo,double amount) throws InvalidAccountException,NegativeAmountException
	{
		if(amount>0)
		{
			if(al.getList(a)==accountNo)
			{
				System.out.println(accountNo +" ac balance is "+a.getBalance());
				a.setBalance(a.getBalance()+amount);
				System.out.println(amount+"Rs Deposit Successful");
				return a.getBalance();	
			}
			else
			{
				throw new InvalidAccountException("Invalid Account Number");
			}
		}
		else
		{
			throw new NegativeAmountException("Negative Amount Entered");
		}
	}
	double withdraw(int accountNo,double amount) throws InvalidAccountException, InsufficientFundsException, NegativeAmountException
	{
		if(amount>0)
		{
			if(a.getBalance()>amount)
			{
				if(al.getList(a)==accountNo)
				{
					System.out.println(accountNo +" ac balance is "+a.getBalance());
					a.setBalance(a.getBalance()-amount);
					System.out.println(amount+"Rs Withdraw Successfull");
					return a.getBalance();	
				}
				else
				{
					throw new InvalidAccountException("Invalid Account Number");
				}
			}
			else
			{
				throw new InsufficientFundsException("Insufficient Balance in Your Account");
			}
		}
		else
		{
			throw new NegativeAmountException("Negative Amount Entered");
		}
	}
}
