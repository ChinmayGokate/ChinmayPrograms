
public class XxxValue {
	public static void main(String[] args) {
		//convert wrapper to primitive datatype
		Integer i = new Integer(100);  //create wrapper object by constructor
		Integer i1= i.intValue();
		Float f = i.floatValue();
		System.out.println(f);
		System.out.println(i1);
		System.out.println(f+i1);
		
		Integer i2= Integer.valueOf(1000); //create wrapper object by valueOf() method
		Double i3 = i2.doubleValue();
		Long l = i2.longValue();
		System.out.println(i3);
		System.out.println(l);
		System.out.println(l+i3);
		
		//convert wrapper to String
		String s = i.toString();
		System.out.println(s);
		
		String s1 = i2.toString();
		System.out.println(s1);
		}
}
