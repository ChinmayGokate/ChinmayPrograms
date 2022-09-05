

//Creating a class 'CheckDigit' containing a method with string array as an argument.Each string element in that array may contain digits and alphabets(“3ab2d”). Extract digits from each string and find the sum of digits.
//Method Name: checkDigit()
//Argument: String []
//Return Type: Integer
//For example
//Input :{ ca21, la3df, 21cd, 8c}
//Output: 2+1+3+2+1+8=17

public class CheckDigit 
{
	void checkDigit(String s[]) 
	{
		char[] ch=new char[20];
		String s1="";
		int a=0;
		for(int i=0;i<s.length;i++)
		{
			ch=s[i].toCharArray();
			for(char c:ch)
			{
				if(Character.isDigit(c))
				{
					int no=Character.getNumericValue(c);
					a=a+no;
					System.out.println(c);
				}
				
			}
		}
		System.out.println(a);
		//return 0;
	}
	public void m2()
	{
		String s[]= {"ca21","la3df","21cd","8c"};
		char ch[];
		int a=0;
		String s1="";
		for(int i=0;i<s.length;i++)
		{
			s1="";
			ch=s[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				if(ch[j]>=48 && ch[j]<=57)
				{
					System.out.println(ch[j]);
					int no=Character.getNumericValue(ch[j]);
					a=a+no;
					s1=s1+no;
				}
			}
			//int no1=Integer.parseInt(s1);
			//a=no1+a;
			//System.out.println(" "+a);
			
			
		}
		System.out.println(a);
	}
	public void CountDigits()
	{
		String str = "GeeksforGeeks password is : 1234";
	    int digits = 0;
	    int a=0;
	    for (int i = 0; i < str.length(); i++) 
	    {
	        if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
	        { 
	        	digits++;
	        	int no=Character.getNumericValue(str.charAt(i));
	        	a=a+no;
	        	//System.out.println(str.charAt(i));
	        	System.out.println(a);
	        	
	        }
	    }
	    System.out.println("Total number of Digits = "+ digits);
	}
	
	public static void main(String[] args) 
	{
		String s[]= {"ca21","la3df","21cd","8c"};
		CheckDigit cd=new CheckDigit();
		//cd.checkDigit(s);
		cd.m2();
	}
}
