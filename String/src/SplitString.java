/*Creating a class 'SplitString' containing a method with string as an argument. 
 * That method split the string where a ‘,’ or ‘.’ is present and print the split 
 * Strings using enhanced for loop.
Method Name: splitString()
Argument: String
Return Type: String[]
For example
Input: Java is a simple,object oriented programming. Developed by SUNMS systems.
Output:
Java is a simple
object oriented programming
Developed by SUNMS systems
*/
public class SplitString 
{
	public void splitString(String str)
	{
		String s1= "";
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)==',' || str.charAt(i)=='.')
			{
				s1=s1+"\n";
			}
			else
			{
				s1=s1+str.charAt(i);
			}
		}
		System.out.println(s1);
		
	}
	public static void main(String[] args) 
	{
		String str= "Java is a simple,object oriented programming.Developed by SUNMS systems.";
		SplitString ss=new SplitString();
		ss.splitString(str);
	}
}
