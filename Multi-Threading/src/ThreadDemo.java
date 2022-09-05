
public class ThreadDemo {

	public static void main(String[] args) {
		
		FristMyThread fmt = new FristMyThread();
		fmt.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}

}
