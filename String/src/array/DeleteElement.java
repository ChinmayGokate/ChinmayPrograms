package array;

public class DeleteElement 
{
	public void deleteArrayElements(int[] arr)
	{
		int index=4;
		for(int i=0;i<arr.length-1;i++)
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
	public static void main(String[] args) 
	{
		int[] arr = {10,20,30,40,56,83,90,29};
		 DeleteElement el = new DeleteElement();
		 el.deleteArrayElements(arr);
	}
}
