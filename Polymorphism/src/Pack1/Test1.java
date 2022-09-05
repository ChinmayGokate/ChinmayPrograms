package Pack1;


class Super1
{
	int a=100;
	int b=10;
	static void doctor()
	{
		System.out.println("tablet");
	}
}
public class Test1 extends Super1
{
	int a=1000;
	static void doctor()
	{
		System.out.println("medicine");
	}
	public static void main(String args[])
	{
		Super1 p=new Test1();
		p.doctor();
		System.out.println(p.a);
		System.out.println(p.b);
	}
}
