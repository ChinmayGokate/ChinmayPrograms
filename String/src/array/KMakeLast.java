package array;

public class KMakeLast 
{
	public int[] markLast(int[] arr)
	{
		 int arr1[]=new int[arr.length*2];
		 arr1[arr1.length-1]=arr[arr.length-1];
		 
		 return arr1;
	}
	public static void main(String[] args) {
		KMakeLast ms=new KMakeLast();
		int a[]=ms.markLast(new int[] {5,2});
		for(int x:a)
		{
			System.out.println(x);
		}
	}
}
