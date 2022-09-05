package array;
/*Define a method which accepts an array of numbers and return the sum of unique numbers from the array.

Write the method with the following specifications: 

Name of method sumOfArray() 
Arguments: one argument of type integer array
Return Type: an integer value

Specifications: The value returned by the method sumOfArray() is determined by the 
following rules:

Array must not be null or length must not be 0. If yes, then return -1                                                               
Array must not contain negative values. If yes, then return -2

Input: {1, 2, 3, 2, 4, 1}
Output: 7*/
public class AddingUniqueElements 
{
	public void addUnique(int arr[])
	{
		int arr1[]=new int[10];
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(arr[i]);
				sum=sum+arr[i];
				
			}
		}System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,2,4,1,3,5};
		new AddingUniqueElements().addUnique(arr);
	}
}
