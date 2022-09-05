package com.ni.ex;

public class SecoudLargestElement 
{
	public void withOutSorting()
	{
		int arr[]= {1,7,12,4,9,4,6,10,8,11};
		int arr1[] = new int[20];
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<max)
			{
				arr1[i]=arr[i];
			}
		}
		int max1=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]>max1)
			{
				max1=arr[i];
			}
		}
		System.out.println("Largest element:"+max);
		System.out.println("Second largest element:"+max1);
	}
	public static void main(String[] args) {
		new SecoudLargestElement().withOutSorting();
	}
}
