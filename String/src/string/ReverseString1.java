package string;

public class ReverseString1 
{
	public void reverse(String s)
	{
		System.out.println(s);
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			
			String s2="";
			
			for(int j=s1[i].length()-1;j>=0;j--)
			{
				s2=s2+s1[i].charAt(j);
			}
			
			System.out.print(s2+" ");
		}
		
	}
	public static void main(String[] args) 
	{
		String s= "Welcome to Nareshit";
		new ReverseString1().reverse(s);
	}
}
