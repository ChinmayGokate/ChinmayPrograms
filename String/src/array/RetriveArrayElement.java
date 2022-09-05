package array;

public class RetriveArrayElement 
{
	public void meth1()
	{
	int arr[]= {1,2,3,4,5,6,7,8,9};
	
//	for(int i=0;i<arr.length;i++)
//	{
//		System.out.println(arr[i]);
//	}
	for(int x: arr)
	{
		System.out.println(x);
	}
	}
	public static void main(String[] args) {
		new RetriveArrayElement().meth1();
	}
	
}
