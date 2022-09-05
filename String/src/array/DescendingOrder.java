package array;

import java.util.Scanner;

public class DescendingOrder 
{
	public void descendingArray(int[] arr)
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=scan.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter element of array");
		for(int i=0;i<arr.length;i++)
		{
			 arr[i]=scan.nextInt();
		}
	 new DescendingOrder().descendingArray(arr);
	}
}
