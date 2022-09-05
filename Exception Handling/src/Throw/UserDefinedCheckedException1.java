package Throw;

import java.util.Scanner;

public class UserDefinedCheckedException1 
{
  static void add(int a,int b) throws AddException
  {
	  int c = a+b;
	  if(c>100)
	  {
		  System.out.println(c);
	  }
	  else
	  {
		  throw new AddException();
	  }
  }
	public static void main(String[] args) throws AddException
	{
		Scanner s = new Scanner (System.in);
		System.out.println("enter value for a and b");
		int a = s.nextInt();
		int b = s.nextInt();
		UserDefinedCheckedException1.add(a,b);
	}

}
