package Throw;

import java.util.Scanner;

public class UserDefinedCheckedException2 {
	
	void add(int age) throws ParameterizedAddException
	{
		if (age > 21)
		{
			System.out.println(" you are eligible for marrage");
		}
		else
		{
			throw new ParameterizedAddException("you are not eligible for marrage");
		}
	}
	public static void main(String[] args) throws ParameterizedAddException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter your age");
		int age = s.nextInt();
		UserDefinedCheckedException2 ude = new UserDefinedCheckedException2();
		ude.add(age);
		}

}
