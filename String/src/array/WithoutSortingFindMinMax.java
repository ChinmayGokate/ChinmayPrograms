package array;
//find second largest element
public class WithoutSortingFindMinMax 
{
	public void withoutSort()
	{
		int arr[]= {7,1,5,8,6,11,9,4,3};
		int max=0;
		int arr1[]=new int[20];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
		}
		int min=max;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
				
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<max)
			{
				arr1[i]=arr[i];
				//System.out.println(arr1[i]);
			}
			
			
			
		}
		int max11=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]>max11)
			{
				max11=arr[i];
			}
		}
		System.out.println("second largest value :"+max11);
		System.out.println("max :"+max);
		System.out.println("min :"+min);
	}
	public static void main(String[] args) {
		new WithoutSortingFindMinMax().withoutSort();
	}
}
