class O
{
	public static void m1() {
		System.out.println("parent static");
	}
	public static void main(String[] args) 
	{
		System.out.println("parent");
	}
}
public class Test extends O
{
	public static void m1() {
		System.out.println("child static");
	}
	Test()   //
	{
		
	}
    public static void main(String... args)
    {
    	System.out.println("child");
    	Test.m1();//creating pure child class object  
    	O o=new Test();//Creating child class object and Store it into Parent class object 
    	o.m1();
    }

}