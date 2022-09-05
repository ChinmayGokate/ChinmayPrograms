
package string;

import java.util.Scanner;

/*Create a class containing a method to create the mirror image of a String. The method 
 * should return the two Strings separated with a pipe(|) symbol .

Method Name 	getImage 
Method Description 	Generate the mirror image of a String and add it to the existing string. 
Argument 	String 
Return Type 	String 
For Example 
Input : EARTH 
Output : EARTH|HTRAE 
Note: Don't use StringBuffer class*/
public class MirrorImageOfString 
{
	public void getImage(String s)
	{
		//char ch;
		//String s1="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			ch=s.charAt(i);
//			s1=s1+ch;
//		}
		
		char[] ch=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			 ch[i]=s.charAt(i);	
		}
		char temp = 0;
		for(int i=0;i<ch.length/2;i++)
		{
			temp=ch[i];
			ch[i]=ch[ch.length-i-1];
			 ch[ch.length-i-1]=temp;
		}
		
		System.out.println(ch);
		//return s+"|"+s1;
	}
	public static void main(String[] args) 
	{
//	Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the name :");
//		String s=sc.nextLine();
		MirrorImageOfString mi=new MirrorImageOfString();
		//String s1=mi.getImage(s);
		//System.out.println(s1);
		String s="java";
		mi.getImage(s);
	}
	
	
}
