
public class Test {

	public static void main(String[] args) {
		
		//Autoboxing       before 1.4 ver
		Integer in = Integer.valueOf(100);
		Float fl = Float.valueOf(520.5f);
		System.out.println(in+fl);
		
	//Autoboxing       After 1.4 ver.
		Integer i = 100;
		Float f = 110.5f;
		System.out.println(i);
		System.out.println(f+i);
		
		//AutoUnboxing     before 1.4 ver.
		Integer a = 1500;
		int i1 = a.intValue();
		System.out.println(i1);
		
	//AutoUnboxing     After 1.4 ver.
		int i2 = new Integer(1000);
		int i3 = new Integer(2000);
		System.out.println(i2+i3);
	}

}
