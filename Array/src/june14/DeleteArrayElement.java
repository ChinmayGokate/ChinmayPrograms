package june14;

import java.util.Scanner;

public class DeleteArrayElement 
{
	public void deleteArrayElement()
	{
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size =");
		int n=sc.nextInt();
		System.out.println("Enter array Element =");
		for(int i=0;i<n;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		int temp=0,i,s;
		System.out.println("Enter array element to delete =");
		s=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			if(s==arr[i])
			{
				for(int j=i;j<n;j++,i++)
				{
					arr[i]=arr[i+1];
				}
				
			}
			
			
		}
		for(i=0;i<n-1;i++)
		System.out.print(arr[i]+" ");	
	}
	public static void main(String[] args) 
	{
		new DeleteArrayElement().deleteArrayElement();
	}
	
//	public void reverseArray()
//	{
//		int arr[]= {5,4,3,2,1};
//		int temp=0,i,s=3;
//		
//		for(i=0;i<=4;i++)
//		{
//			if(s==arr[i])
//			{
//				for(int j=i;j<4;j++,i++)
//				{
//					arr[i]=arr[i+1];
//				}
//				
//			}
//			
//			
//		}
//		for(i=0;i<=4-1;i++)
//		System.out.print(arr[i]+" ");	
//	}
	
}
