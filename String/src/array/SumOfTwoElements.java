package array;

public class SumOfTwoElements 
{
	public void meth1()
	{
		int arr[]= {10,20,30,40,50,60,70,80,90};
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=i+1;j<arr.length;j++)
			{
				sum=arr[i]+arr[j];
				if(sum==80)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
	public static void main(String[] args) {
		new SumOfTwoElements().meth1();
	}
}
