package june14;

public class ClassA
{
	public void reverseArray()
	{
		int arr[]= {5,4,3,2,1};
		int temp=0,i;
		for(i=0;i<=4/2;i++)
		{
			temp=arr[i];
			arr[i]=arr[5-i-1];
			arr[5-i-1]=temp;
			
		}
		for(i=0;i<=4;i++)
		System.out.print(arr[i]+" ");	
	}
	public static void main(String[] args) 
	{
		new ClassA().reverseArray();
	}
}
