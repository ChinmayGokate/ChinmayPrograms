package array;
//Correct program
public class AddingElement 
{
	public void addElement(int arr[])
	{
		int arr1[]=new int[arr.length+1];
		int element=20;
		int index=4;
		for(int i=0,j=0;i<arr.length;i++,j++)
		{	
			if(i==4)
			{
				arr1[j]=element;
				j++;
			}
			arr1[j]=arr[i];
			//System.out.println(arr1[j]);
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50,60,70};
		new AddingElement().addElement(arr);
	}
}
