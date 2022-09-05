
//super Interface must be interface

interface Interface1
{
	void m1();
	void m2();
	void m3();
	
}
public class Test1 implements Interface1
{
	public void m1()
	{
		System.out.println("m1");
	}
	public void m2()
	{
		System.out.println("m2");
	}
	public void m3()
	{
		System.out.println("m3");
	}
	
	public static void main(String[] args) {
		Test1 t=new Test1();
		t.m1();
		t.m2();
		t.m3();
		
		Interface1 i=new Test1();
		i.m1();
		i.m2();
		i.m3();
	}
}

