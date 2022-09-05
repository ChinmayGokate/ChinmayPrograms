
public class Test {
	int a;
	String s;
	
	public Test(int a, String s) {
		super();
		this.a = a;
		this.s = s;
	}
	public String toString()
	{	
		return "name = "+a+"name = "+s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test(111,"chinmay");
		System.out.println(t);
	}

}
