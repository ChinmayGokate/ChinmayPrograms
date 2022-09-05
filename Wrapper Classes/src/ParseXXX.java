
public class ParseXXX {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException
	{	
		//primitive to String
		int a=10,b=30;
		float f=41.3f,f1=41.5f;
		
		String s = String.valueOf(a+b);
		System.out.println(s);        //40
		
		String s1 = String.valueOf(f+f1);
		System.out.println(s1);       //82.8
		
		System.out.println(s+s1);      //4082.8
		
		//String to Primitive datatype
		String str = "1000";
		int i = Integer.parseInt(str);
		System.out.println(i);       //1000
		
		//ex:2
		
		System.out.println(args.length);  //6
		
		System.out.println(args[0]);     //5
		System.out.println(args[1]);     //6
		System.out.println(args[0]+args[1]);   //56
		
		int i1 = Integer.parseInt(args[0]);
		float fl = Float.parseFloat(args[1]);
		System.out.println(i1+fl);             //11.0
			
	}

}
