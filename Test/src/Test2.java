

class X
{
	static int i=7;
	void m2()
	{
		System.out.println("parent abstract");
	}
	static void m1()
	{
		System.out.println("chinmay");
	}
	
	
}
class Y extends X
{
	int i=20;
	void m2()
	{
		System.out.println("abstract ");
		System.out.println(i);
	}
	
	static void m1()
	{
		System.out.println("chinmay1");
	}
}
public class Test2 
{
	public static void main(String[] args) 
	{
		X y = new Y();
		y.m1();
		y.m2();
	}
}
