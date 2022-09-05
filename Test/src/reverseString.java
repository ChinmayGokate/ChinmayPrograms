import java.util.Scanner;



//import com.sun.tools.classfile.CharacterRangeTable_attribute;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name = ");
		String s = sc.next();
		
	//by using charAt() and lenght().
//		String rev="";
//		//lenght();
//		//charAt();
//		int len=s.length();
//		for(int i=len-1;i>=0;i--)
//		{
//			rev= rev + s.charAt(i);
//		}
//		System.out.println(rev);
	
		
	//by using length and toCharArray()- is use to store the string charactor to charactor array
//		char arr[] = s.toCharArray();
//		//char arr[] = {'a','b','c','d'};
//		String rev = "" ;
//		int len=arr.length;
//		for(int i=len-1;i>=0;i--) {
//			rev =  rev + arr[i];
//		}
//		System.out.println(rev);
	
		
	//By using StringBuffer class
		StringBuffer sb = new StringBuffer(s);
		StringBuffer sb1 = sb.reverse();
		System.out.println(sb1);
		
		

	}

}
