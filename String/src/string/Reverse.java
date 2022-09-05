package string;

public class Reverse 
{
//	public String reverseImage(String s)
//	{
//		char ch[]=new char[s.length()];
//		String s1="";
//		for(int i=0;i<s.length();i++)
//		{
//			ch[i]=s.charAt(i);
//		}
//		for(int i=ch.length-1;i>=0;i--)
//		{
//			s1=s1+ch[i];
//		}
//		return s1;
//	}
	
	//by sir
	public String reverse1(String s)
	{
		String s1="";
		//s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--)
			{
				s1=s1+s.charAt(i);
			}
		return s1;
	}
	public static void main(String[] args) {
		Reverse r=new Reverse();
		String s=r.reverse1("javadfkjhksh");
		System.out.println(s);
	}
}
