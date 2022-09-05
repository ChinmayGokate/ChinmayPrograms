package array;

public class ArrayExampleByKishan 
{
	public boolean meth2()
	{
		int arr[]= {4,5};
		for(int i=0;i<arr.length;i++)
		if(arr[i]==2 || arr[i]==3)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		ArrayExampleByKishan aob=new ArrayExampleByKishan();
		boolean b=aob.meth2();
		System.out.println(b);
	}
}
