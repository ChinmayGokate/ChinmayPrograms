
class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,60,50};
		for (int i=0;i<=4;i++)
		{
			System.out.println(arr[i]);
		}
		
		for (int i=1;i<=4;i++)
		{
			if(arr[i]>arr[0])
			{
				arr[0]=arr[i];
			}
		}
		System.out.println("biggest no. is "+arr[0]);
	}

}
