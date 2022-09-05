
public class Test2 {
	int a=100;
	String str = "chinamy";
	
	public void m1()
	{
		int a=11;
		char ch='2';
		int c=Character.getNumericValue(ch);
		
		
		System.out.println(a+ch);
		System.out.println(a+c);
	}
	public String toString() {
		return "id= "+a+" name= "+str;
	}

	public static void main(String args[])
	{
		Test2 t = new Test2();
		//System.out.println(t);
		t.m1();
	}
}
