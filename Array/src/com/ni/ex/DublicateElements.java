package com.ni.ex;

public class DublicateElements 
{
	public void find(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=i+1;j<arr.length;j++)//int j=i;
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==1)//(count==2)
			{
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,3,4,2,5,7,2,2,6,7,8,5,2,2,1};
		DublicateElements de=new DublicateElements();
		de.find(arr);
	}
		
	
}
