
public class DeomenThread extends Thread
{
	public void run()
	{
		int i=10;
		i=i++;
		while(true)
		{
			System.out.println("Deomen "+i);
		}
	}
	public static void main(String[] args) {
		DeomenThread d = new DeomenThread();
		//Thread t=new Thread(d);
		d.setDaemon(true);
		d.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println(currentThread().getName());
			System.out.println(d.getName()+"="+i);
		}
		
	}
}
