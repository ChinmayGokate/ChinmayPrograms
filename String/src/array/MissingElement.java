package array;
/*wap to find the missing alement in an int array and the range of the array  is between 1 to 7
arr[]=new int{1,2,3,6,7}*/
public class MissingElement 
{
	public void meth1()
	{
		int arr[]= {1,2,3,5,6,7};
		
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]!=i+1)
			{
				System.out.println(i+1);
				
				break;
			}
				
		}
	}
	public static void main(String[] args) {
		new MissingElement().meth1();
		
	}
}
