package array;

public class KRotateLeft 
{
	public int[] rotateLeft(int[] arr)
	{
		int arr1[]=new int[3],a = 0,temp=0;
		    
			arr1[arr.length-1]=arr[0];
			arr1[0]=arr[arr.length-2];
			arr1[arr.length-2]=arr[arr.length-1];
			
			return arr1;
	}
	public static void main(String[] args) {
		int a[]=new KRotateLeft().rotateLeft(new int[] {1,2,3});
		//System.out.println(a);
		for(int x:a)
		{
			System.out.println(x);
		}
	}
}
