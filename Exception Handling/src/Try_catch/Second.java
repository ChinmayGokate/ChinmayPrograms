package Try_catch;

public class Second {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Kaustubh sheth");
			try {
			System.out.println(10/0);
			System.out.println("this code is not execute because , when exception is raised in try block , remaining code is not executed");
			}
			catch(ArithmeticException ae)
			{
				System.out.println(10/2);
				System.out.println("Durvesh officers");
			}
			
			System.out.println("Rest Of The Application");
		}

	}
