package array;
/*wap to copy element from one array to another array.*/
public class CopyElementOneToAnother 
{
	public void meth1()
	{
		int arr[]= {1,2,3,4,5,6,7,8};
		int arr1[]=new int[10];
		
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
			System.out.println(arr1[i]);
		}
		
	}
	public static void main(String[] args) {
		new CopyElementOneToAnother().meth1();
	}
}
