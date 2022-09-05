package array;
/*wap to find the dublicale element in the array*/
public class DublicateElementLab 
{
	public void meth1()
	{
		
		int arr[]= {1,2,3,3,4,3,5,2,6,6,8,4,7,2,1};
		for(int i=0;i<arr.length;i++)
		{
			 int count=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(arr[i]);
			}
		}
	}
	public static void main(String[] args) {
		new DublicateElementLab().meth1();
	}
}
