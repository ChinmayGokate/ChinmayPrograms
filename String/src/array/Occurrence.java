package array;

import java.util.Arrays;

/*arr{1,2,3,4,2,3,6}; -------------1==1 2==2 3==2 4==1 6==1*/
public class Occurrence 
{
	public void meth1()
	{
		int arr[]=new int[] {1,2,3,4,2,3,6};
		//Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					i++;
				}
			}
			
				System.out.println(arr[i]+"=="+count);
			
		}
	}
	public static void main(String[] args) {
		new Occurrence().meth1();
	}
}
