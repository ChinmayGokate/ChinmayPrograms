package string;

public class StringUpperCase 
{
	public void upperCase(String s)
	{
		String s2="";
		
		for(int i=0;i<s.length();i++) 
		{
			String s1="";
			if(i%2==0)
			{
				
				s1=s1+s.charAt(i);
				s1=s1.toUpperCase();
				
			}
			else {
				s1=s1+s.charAt(i);
				s1=s1.toLowerCase();
			}
			s2=s2+s1;	
		}
		System.out.println(s2);
	}
	public static void main(String[] args) 
	{
		new StringUpperCase().upperCase("Welcome To NareshIt");
	}
}
