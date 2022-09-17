package array;

public class DeleteElement 
{
	public void deleteArrayElements(int[] arr)
	{
		int index=4;
		for(int i=0;i<arr.length;i++)
		{
				if(i==index)
				{
					for(int j=i;j<arr.length-1;j++)
					{
						arr[j]=arr[j+1];
					}	
				}
				System.out.println(arr[i]);
		}
	}
	//NOT WORKING PROPERLY
//	public void withContinue(int []arr)
//	{
//		int index=4;
//		int arr1[]=new int[arr.length];
//		for(int i=0;i<arr.length;i++)
//		{
//			if(i==index)
//			{
//				continue;
//			}
//			arr1[i]=arr[i];
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr1[i]);
//		}
	//}
	public static void main(String[] args) 
	{
		int[] arr = {10,20,30,40,56,83,90,29};
		 DeleteElement el = new DeleteElement();
		 el.deleteArrayElements(arr);
		// el.withContinue(arr);
	}
}
