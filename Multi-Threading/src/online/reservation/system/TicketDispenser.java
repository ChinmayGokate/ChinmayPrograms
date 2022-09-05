package online.reservation.system;

public class TicketDispenser implements Runnable
{
	int maximumSeats=100;
	int allotedSeats=96;
	
	@Override
	public void run() {
		int a=allotSeatNumber();
		System.out.println(a);
	}
	
	synchronized int allotSeatNumber()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
		if(maximumSeats>allotedSeats)
		{
			++allotedSeats;
			System.out.print(Thread.currentThread().getName()+"Seat alloted");
			return allotedSeats;
		}
		else
		{
			System.out.print("Seats not available");
			return -1;
		}
		
		
		
	}
	
}
