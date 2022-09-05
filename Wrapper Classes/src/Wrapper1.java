
public class Wrapper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//by Constructor
		Integer i = new Integer(100);
		Integer i1 = new Integer("1000");
		System.out.println(i+i1);
		
		Float f1 = new Float(100.5);
		Float f2 = new Float(100.5f);
		Float f3 = new Float("100.5");
		System.out.println(f1+f2+f3);
		
		Character c = new Character('a');
		System.out.println(c);
		
		//by valuef() method
		Integer ii = Integer.valueOf(100);
		Integer ii2 = Integer.valueOf("100");
		System.out.println(ii+ii2);
		
		Float ff = Float.valueOf(100.5f);
		Float ff1= Float.valueOf("100.50");
		//Float ff2= Float.valueOf(100.5);
		System.out.println(ff+ff1);
		
		
		
		
	}

}
