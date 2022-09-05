//Different thread are performing single task

public class ThreadDemo1
{
	public static void main(String args[])
	{
		FristMyThread t1 = new FristMyThread();
		t1.start();
		FristMyThread t2 = new FristMyThread();
		t2.start();
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.setName("ratan");
		System.out.println(t1.getName());
		
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Chinmay");
		System.out.println(Thread.currentThread().getName());
		
		System.out.println(t1.getId());
		System.out.println(t2.getId());
		System.out.println(Thread.currentThread().getId());
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(Thread.currentThread().isAlive());
		
		System.out.println(Thread.activeCount());
			
	}
}