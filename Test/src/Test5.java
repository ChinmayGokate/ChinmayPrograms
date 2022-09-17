
class demo1
{
	private void m1()
    {
        System.out.println("From parent m1()");
    }
  
    protected void m2()
    {
        System.out.println("From parent m2()");
    }
}
public class Test5 extends demo1
{
	private void m1()
    {
        System.out.println("From child m1()");
    }
  
    // overriding method
    // with more accessibility
    @Override
    public void m2()
    {
        System.out.println("From child m2()");
    }
    
    public static void main(String[] args)
    {
        demo1 obj1 = new demo1();
        obj1.m2();
        demo1 obj2 = new Test5();
        obj2.m2();
       // obj2.m1();
    }
}
