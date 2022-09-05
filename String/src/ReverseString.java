import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

/*Creating a class ‘ReverseByWord’ containing a method with string as an argument. That method should return reverse the given string by word.
Method Name: reverseWord()
Argument: String 
Return Type: String
For example
Input: all are enjoying with java
Output:lla era gniyojne htiw avaj
Note
Develop above program by using StringTokenizer class and without StringTokenizer class
*/
public class ReverseString 
{
	public void withTokenizer(String str)
	{
		StringTokenizer st=new StringTokenizer(str);//slit by default with Space
		//StringTokenizer st=new StringTokenizer("Chinmay,is,a,good,boy",",");
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
	public void withOutTokenizer(String str)
	{
		String str1[]= {};
		str1=str.split(" ");
		String s1="";
		for(int i=0;i<str1.length;i++)
		{
			for(int j=str1[i].length()-1;j>=0;j--)
			{
				s1=s1+str1[i].charAt(j);
			}
			s1=s1+" ";
		}
		System.out.println(s1+" ");
		//System.out.println(str1[1]);
	}
	public static void main(String[] args) 
	{
		String str="enjoying with java";
		ReverseString rs=new ReverseString();
		//rs.withTokenizer(str);
		rs.withOutTokenizer(str);
	}
}
