import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		String s1 = "AAB";
		String s2 = "D";

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int status = 0;
		Arrays.sort(c1);
		Arrays.sort(c2);
		status = Arrays.compare(c1, c2);
		if (status == 0) {
			System.out.println("ANA");
		} else {
			System.out.println("NANA");
		}
	}
}
