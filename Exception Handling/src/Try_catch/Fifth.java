package Try_catch;

import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
			
				Scanner s = new Scanner(System.in);
				System.out.println("enter the number");
				int a = s.nextInt();
				try {
				System.out.println(10/a);      //ArithmeticException
				System.out.println("ratan".charAt(5));  //StringIndexOutOfBoundsException
				}
				catch(ArithmeticException ae)
				{
					System.out.println(10/2);
					System.out.println("Durvesh officers");
				}
				catch (Exception se)
				{
					System.out.println("ratan".charAt(3));
				}
				System.out.println("Rest Of The Application");
			}

		}
