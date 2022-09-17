package string;
/*Create a method which can perform a particular String operation based on the user�s choice.
 The method should accept the String object and the user�s choice and return the output of the operation. 
Options are 
A: Add the String to itself 
B: Replace alternate positions with * 
C: Remove duplicate characters in the String 
D: Change alternate characters to upper case
Method Name 	changeString 
Argument 	String string, char ch 
Return Type 	String */
public class Oparetion 
{
	public String changeString(String string,char ch)
	{
		switch(ch)
		{
		case 'A':{
			String s1=string+string;
			System.out.println(s1);
			break;
		}
		case 'B':
		{
			char ch1[]=new char[string.length()+1];
			for(int i=0;i<string.length();i++)
			{
				ch1[i]=string.charAt(i);
				ch1[i+1]='*';
				i=i+1;	
			}
			System.out.println(ch1);
			break;
		}
		case 'C':
		{
			char ch1[]=new char[string.length()];
			for(int i=0;i<string.length();i++)
			{
				ch1[i]=string.charAt(i);
			}
			System.out.println(ch1);
			for(int i=0;i<ch1.length;i++)
			{
				int count=0;
				for(int j=0;j<ch1.length;j++)
				{
					if(ch1[i]==ch1[j])
					{
						//System.out.println(ch1[i]);
						count++;
					}
				}
				if(count<=2)
				{
					System.out.print(ch1[i]);
				}
			}
			break;
		}
		case 'D':
		}
		
		return null;
		
	}
	public static void main(String[] args) {
		Oparetion op=new Oparetion();
		op.changeString("Chinmayaa", 'C');
	}
}
