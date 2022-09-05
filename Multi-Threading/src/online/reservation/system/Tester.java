package online.reservation.system;

public class Tester 
{
	public static void main(String[] args) 
	{
		TicketDispenser td=new TicketDispenser();
		Thread t1=new Thread(td);
		t1.start();
		
		Thread t2=new Thread(td);
		t2.start();
		
		Thread t3=new Thread(td);
		t3.start();
		
		Thread t4=new Thread(td);
		t4.start();
		
		Thread t5=new Thread(td);
		t5.start();
		
		Thread t6=new Thread(td);
		t6.start();
	}
	
}
