package bank.account;

public class AccountTester 
{
	public static void main(String[] args) 
	{
		Account a= new Account();
		Thread t1=new Thread(a);
		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Thread t2=new Thread(a);
		t2.start();
		
		Thread t3=new Thread(a);
		t3.start();
		
		Thread t4=new Thread(a);
		t4.start();
		
		Thread t5=new Thread(a);
		t5.start();
	}
}
