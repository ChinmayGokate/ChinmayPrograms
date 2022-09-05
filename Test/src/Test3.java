
class Parent
	{
		int a=100;
	}
public class Test3 extends Parent
{
	
		int a=1000;
		public static void main(String args[])
		{
			Parent p=new Test3();
			System.out.println(p.a);
		}
	

}
