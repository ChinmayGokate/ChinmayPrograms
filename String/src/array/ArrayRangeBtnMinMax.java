package array;

import java.util.Scanner;
/*Write a program to Calculate the range of the elements in the array.
Range of an array is the distinction between the maximum integer element 
and minimum integer element in an array.*/
public class ArrayRangeBtnMinMax 
{
	public void arrayRange(int arr[])
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
			
			
		}
		int range = arr[arr.length-1] - arr[0];
		System.out.println("Range of array = "+range);
	}
	public static void main(String[] args) 
	{
		ArrayRangeBtnMinMax ob = new ArrayRangeBtnMinMax();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of array ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		ob.arrayRange(arr);
	}
}
