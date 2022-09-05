package array;
/*wap to print the element in array in reverse order.*/
public class ReverseElement 
{
	public void meth1()
	{
		int arr[]= {1,2,3,4,6,3,4};
		//int arr1[]=new int[10];
		
		for(int i=0;i<arr.length;i++)
		{
			//arr1[i]=arr[arr.length-1-i];
			
			System.out.println(arr[arr.length-1-i]);
			
		}
	}
	public static void main(String[] args) {
		new ReverseElement().meth1();
	}
}
