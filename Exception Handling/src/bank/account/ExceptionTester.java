package bank.account;

import java.util.Scanner;

/*Exceptions are thrown from a program when unexpected data/errors occur such that the program cannot proceed further logically.
 In the classes below, use different exception handling try/catch blocks to handle exceptions that occur.

The following two classes are given to you. You must NOT change any of it.
 
An Account class is given to you. The attributes of the Account which are accountNumber and balance,
 the getters/setters and a constructor are defined.

An AccountList class is given to you. This class contains a list of valid account objects.
 Create an instance of this class and use the getter to get the list of valid Accounts.

The following Three classes are given to you with default constructors.
 You must change these partially as per the requirement given below.

Extend these classes from Exception class. In each class you must define a constructor that
 takes a String message as an argument.

InsufficientFundsException Class
NegativeAmountException class
InvalidAccountException class

A class AccountManager is given to you. In this class define the following three methods:

Method: checkAccount(int AccountNo): this method should use the list in the AccountList class to find out if the given account number exists in the list.
 If yes, return true, if it doesn’t exist, return false

Method: deposit(int accountNo,double amount): In this method get the balance of the account whose account number is passed as parameter.
 Add the given amount and the balance in the account and return the resulting new balance. If the account number doesn’t exist, throw a InvalidAccountException.
 If the amount given is negative, throw a NegativeAmountException.

Method: withdraw(int acountNo,double amount): In this method get the balance of the account whose account number is passed as parameter.
 Subtract the given amount from the balance and return the new balance. If the account number doesn’t exist, throw a InvalidAccountException.
 If the amount given is negative, throw a NegativeAmountException. If the amount to withdraw is more than the existing balance, throw a InsufficientFundException.

A class called ExceptionTester is given where you have your main method. In this method you can create instances of CheckingAccount class.
 Call the methods in the class with various inputs and test that they are working as expected.
 * */
public class ExceptionTester 
{
//	static AccountManager am=new AccountManager();
//	static Scanner sc = new Scanner(System.in);
//	static void check()
//	{
//		System.out.print("Enter account no to checking ");
//		int no=sc.nextInt();
//		System.out.println("Check account: "+am.checkAccount(no));
//		if(am.checkAccount(no)==false)
//		{
//			check();
//		}
//	}
	public static void main(String[] args) 
	{
		//Account a=new Account(107, 5000);
		Account a=new Account();
		AccountList al=new AccountList();
		int list=al.getList(a);
		System.out.println(list);
		AccountManager am=new AccountManager();
		
		
		//ExceptionTester.check();
		System.out.println("Check account: "+am.checkAccount(107));
		
		try {
			System.out.println("Account Balance is "+am.deposit(107, -5000));
		} catch (InvalidAccountException | NegativeAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("Account Balance is "+am.withdraw(107, 9000));
		} catch (InvalidAccountException | InsufficientFundsException | NegativeAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} 
}
