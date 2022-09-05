package array;



public class AscendingOrder1 
{
	void meth()
	{
		int arr[]= {1,4,2,6,3,5};
		for(int i=0;i<arr.length;i++)
		{
			int temp=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[i+1])
				{
					//System.out.println(arr[i]);
					if(arr[i]>arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
					//System.out.println("  "+arr[i]);
				}
				//System.out.println("     "+arr[i]);
			}
			System.out.println("            "+arr[i]);
		}
		
	}
	public static void main(String[] args) 
	{
		new AscendingOrder1().meth();
	}
}
