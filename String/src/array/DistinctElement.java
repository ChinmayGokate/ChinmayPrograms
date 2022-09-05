
package array;
/*NO. OF DISTINCT ELEMENTS IN AN UNSORTED ARRAY
Write a program to find the number of distinct elements in a unsorted array. [without using sorting the array]
Sample Input:
5 3 2 3 780 90
Sample Output:
4*/
public class DistinctElement 
{
	int arr[]= {5,3,2,3,780,90,2};
	int d=0;
	public void distinct()
	{
		
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
				d++;
			}
			
		}
		//System.out.println(count);
		System.out.println("distinct elements "+d);
	}
	public static void main(String[] args) 
	{
		DistinctElement de=new DistinctElement();
		de.distinct();
	}
	
}
