package string;

public class ReverseString 
{
	public void reverse(String s)
	{
		//System.out.println(s.length());
		String s1[]=s.split(" ",s.length());
		
		System.out.println();
		for(int i=s1.length-1;i>=0;i--)
		{
			System.out.print(s1[i]+" ");
		}
	}
	public static void main(String[] args) {
		new ReverseString().reverse("welcome to nareshit");
	}
}
//String {welcome to nareshit}
//count how many time a is repeated and also print the character also
