
public class Test4 
{
	public static void main(String[] args) {
		String s="chinmayas";
		char[]c= s.toCharArray();
		String part1 = "";
		String part2="";
		String part3="";
		
		for(int i=0;i<=2;i++)
		{
			part1=part1+c[i];
		}
		
		
		for(int i=3;i<=5;i++)
		{
			part2=part2+c[i];
		}
		for(int i=6;i<=8;i++)
		{
			part3=part3+c[i];
		}
		System.out.println(part1);
		System.out.println(part2);
		System.out.println(part3);
	}
}
