package june14;

public class ClassC 
{
		public void findArrayElement()
		{
			int arr[]= {5,4,3,2,1};
			int temp=0,i,s=1;
			
			for(i=0;i<=4;i++)
			{				
				if(s==arr[i])
				{
					System.out.println((i+1));
				}
			}
			for(i=0;i<=4;i++)
			System.out.print(arr[i]+" ");	
		}
		public static void main(String[] args) 
		{
			new ClassC().findArrayElement();
		}
	
}
