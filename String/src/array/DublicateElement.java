package array;

public class DublicateElement 
{
	public void meth1()
	{
		int arr[]= {1,2,2,3,4,4,2};
		
		for(int i=0;i<arr.length;i++)
		{  int count=0;
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
	public static void main(String[] args) 
	{
		new DublicateElement().meth1();
	}
}
