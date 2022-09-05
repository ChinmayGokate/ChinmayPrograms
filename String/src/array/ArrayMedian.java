package array;

public class ArrayMedian 
{
	public void median()
	{
		int arr[]= {1,4,2,6,3,5,7,9,8,10};
		int temp,sum;
		//sort
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
		
		if((arr.length)%2==0)
		{
			sum=arr[(arr.length-1)/2]+arr[((arr.length-1)/2)+1];
			System.out.println("Sum of median no.s is "+sum);
		}
		else
		{
			System.out.println("median no.s is "+arr[arr.length/2]);
		}
		
	}
	public static void main(String[] args) {
		ArrayMedian am =new ArrayMedian();
				am.median();
	}
}
