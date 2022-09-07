package com.ex.string;

import java.util.Scanner;

/*Creating a class 'StringOperations' containg a method. That method should accept the String object and
  the user’s choice and return the output of the operation. 
	Options are 
	1: Add the String to itself 
	2: Replace alternate positions with * 
	3: Remove duplicate characters in the String 
	4: Change alternate characters to upper case
	Method Name: stringOperations()
	Argument: String, int
	Return Type: String
*/
public class StringOperations 
{
	public String stringOperations(String strOperation,int select)
	{
		String mainString="chinmaya is the king";
		//select options
		switch(select)
		{
		case 1:{
			return mainString+strOperation;
		}
		case 2:{
			String replaceStr="";
			char ch[]=new char[mainString.length()];
			ch=mainString.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]>='a' && ch[i]<='z')
				{
					if(i%2==0)
					{
						replaceStr=replaceStr+(char)(ch[i]-32);
						//replaceStr=replaceStr+"*";
					}
					else
					{
						replaceStr=replaceStr+ch[i];
					}	
				}
				else
				{
					replaceStr=replaceStr+ch[i];
				}
			}
			return replaceStr;
			
		}
		case 3:
		{
			char ch[]=new char[mainString.length()];
			ch=mainString.toCharArray();
			System.out.println(ch);
			char ch1[] = new char[100] ;
			ch1[0]= ch[1];
			char ch2 = 0;
			String str1="";
			//char chr[]=(char) (ch[1]+'a');
			for(int i=0;i<ch.length;i++)
			{
				int count=0;
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
						count++;
				}
				if(count==1)
				{
				//to find the duplicate
					for(int k=0;k<ch.length;k++)
					{
						ch1[k]=ch[i];
					}
					
				}
				
				//add all character to string except duplicate
				
				
			}
			for(int k=0;k<ch1.length-1;k++)
				for(int i=0;i<ch.length;i++)
				if(ch[i]!=ch1[k])
				{
					str1=""+ch[i];
				}
			System.out.println(str1);
		}
		case 4:
			
		}
		return "";
	}
	public static void main(String[] args) 
	{
		
		String strOperation="Gokate";
		int select=0;
		Scanner sc=null;
		try 
		{
			sc=new Scanner(System.in);
			if(sc!=null)
			{
				System.out.println("Enter 1-Add String");
				System.out.println("Enter 2-Replace String");
				System.out.println("Enter 3-Remove String");
				System.out.println("Enter 4-Change String");
				select=sc.nextInt();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		StringOperations so=new StringOperations();
		System.out.println(so.stringOperations(strOperation, select));
	}
}
