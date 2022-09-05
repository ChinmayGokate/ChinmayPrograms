package Throws;

public class Test1 {
	void studentDetail() throws InterruptedException
	{
		System.out.println("anu is sleeping");
		Thread.sleep(4000);
		System.out.println("dont distrub");
	}
	void hod()
	{	
		try
		{
		studentDetail();
		}
		catch(InterruptedException ie)
		{
			System.out.println("anu sleeped");		}
	}
	void principle()
	{
		hod();
	}
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.principle();
	}
}
