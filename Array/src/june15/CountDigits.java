package june15;
/* Counting a digits in a number */

public class CountDigits
{
	public void countingDigits(int a)
	{
		int c=0;
		for(int i=a;i!=0;i=i/10)
			c++;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		new CountDigits().countingDigits(1456789);
		
	}

}
