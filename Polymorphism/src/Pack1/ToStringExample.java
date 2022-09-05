package Pack1;

public class ToStringExample 
{
	int a;
	public void finalize()
	{
		System.out.println("object distroyed");
	}
	public static void main(String[] args) {
		ToStringExample ts = new ToStringExample();
		ToStringExample ts1 = new ToStringExample();
		
		System.out.println(ts);
		System.out.println(ts1.toString());
		
		ts=ts1;
		System.gc();
		System.out.println(ts);
		System.out.println(ts1.toString());
		
		//System.out.println(ts.getClass().getName());
		
	}
}
