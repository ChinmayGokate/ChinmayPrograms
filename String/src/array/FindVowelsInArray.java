package array;

public class FindVowelsInArray 
{
	public void FindVowel()
	{
		int count=0;
		char c[]= {'a','b','c','d','e','f','g','h','i','j','o'};
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		new FindVowelsInArray().FindVowel();
	}
}
