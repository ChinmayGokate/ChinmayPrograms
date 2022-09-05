import java.util.Scanner;

public class reverseno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.===");
		int num = sc.nextInt();
		
//		int a=0;
//		while(num!=0) {
//		a=num%10+a*10;
//		num=num/10;
//		}
//		System.out.println(a);
//		
		
	//by using SringBuffer class
//		String s = String.valueOf(num);
//		StringBuffer sb = new StringBuffer(s);
//		StringBuffer rev = sb.reverse();
//		System.out.println(rev);
		
	//by using StringBuilder class
		StringBuilder sb =new StringBuilder();
		sb.append(num);
		StringBuilder rev = sb.reverse();
		System.out.println(rev);
		
	}

}
