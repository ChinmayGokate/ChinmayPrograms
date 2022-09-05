package Try_catch;

import java.util.Scanner;

public class Forth {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
				Scanner s = new Scanner(System.in);
				System.out.println("enter the number");
				int a = s.nextInt();
				
				try {
				System.out.println(10/a);      //ArithmeticException
				System.out.println("ratan".charAt(5));  //StringIndexOutOfBoundsException
				}
				catch(Exception ae)
				{
					System.out.println("By using Exception class in catch block it is possible to hold any type of exception");
					System.out.println(10/2);
					System.out.println("Durvesh officers");
				}
				
				
				System.out.println("Rest Of The Application");
			}

		}
