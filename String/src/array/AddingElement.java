package array;

public class AddingElement 
{
	public void addElement(int arr[])
	{
		int element=20;
		int index=4;
		for(int i=0;i<arr.length;i++)
		{	
			if(i==4)
			{
				arr[i]=element;
			}System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,40,50,60,70};
		new AddingElement().addElement(arr);
	}
}
