package string;

public class ReverseString2 
{
	public String reverse(String s)
	{
		String s1[]=s.split(" ",4);
		String str="";
		for(int i=0;i<s1.length;i++)
		{
			String rev="";
			
			if(i%2!=0)
			{
				for(int j=s1[i].length()-1;j>=0;j--)
				{
					rev=rev+s1[i].charAt(j);	
				}
				str=str+rev+" ";
			}
			else
			str=str+s1[i]+" ";
		}
		return str;
	}
	public static void main(String[] args) 
	{
		String s=new String("my name is vishal");
		ReverseString2 sob=new ReverseString2();
		String str=sob.reverse(s);
		System.out.println(str);
	}
}
