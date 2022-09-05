public class Test{

    static int x = 4;

    public Test(){

        System.out.print(this.x); // line 1
        //static int a=10;
        Test(10);

    }
    void meth1()
    {
    	// static int b=10;
    }
    public static void Test(int x){ // line 2

        //System.out.print(this.x); // line 3

    }
    

    public static void main(String... args){ // line 4

        new Test();

    }

}