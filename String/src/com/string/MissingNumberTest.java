package com.string;

public class MissingNumberTest 
{
	static int arr[]= {2,5,3,8,6,4,7,9,1};
	public static void main(String[] args) 
	{
		int missing=0;
		for(int j=1,i=0,s=1;i<arr.length+1;i++,j++)
		{
			int count=0;
			for(int k=0;k<arr.length;k++)
			{
				if(arr[k]==j)
				{
					count++;
					break;
				}
			}
			if(count==1)
			{
				//System.out.println("arr"+arr[i]+"i::"+i+"=count="+count+"==j"+j+"=s="+s);
				s++;
			}
			if(j==s)
			{
				System.out.println(s);
				break;
			}	
		}
		
	}
}
