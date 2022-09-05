//find the how many object you created in your class
public class CountObject 
{
	static int count=0;
	CountObject()
	{
		count++;
	}
	
	public static void main(String[] args) {
		int x;
		CountObject a1=new CountObject();
		CountObject a2=new CountObject();
		CountObject a3=new CountObject();
		CountObject a4=new CountObject();
		 
		System.out.println(a3.count);
		System.out.println(x);
	}
}
