package com.ni.ex;

public class UniqueElement 
{
	public int meth1()
	{
		int arr[]= {1,2,3,4,3,2,1};
		int unique = 0;
		for(int i=0;i<arr.length;i++)
		{  int count=0;
			for(int j=0;j<arr.length;j++) 
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				
			}
			if(count==1)
			{
				//System.out.println(arr[i]);
				unique=arr[i];
			}	
		}
		return unique;
	}
	public static void main(String[] args) {
		UniqueElement uae=new UniqueElement();
		System.out.println(uae.meth1());
}}
