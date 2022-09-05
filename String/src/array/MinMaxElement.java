package array;
/*wap to find out the maximum and minimum element in the array with the use of asc*/
public class MinMaxElement 
{
	public void meth1()
	{
		
		int arr[]= {3,4,5,1,8,6,9,7};
		//int arr1[]=new int[12];
		for(int i=0;i<arr.length;i++)
		{
			int temp=0;
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
		System.out.println(arr[0]+" "+arr[arr.length-1]);
	}
	public static void main(String[] args) {
		new MinMaxElement().meth1();
	}
}
