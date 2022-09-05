import java.util.StringTokenizer;

public class Stringtokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("hi sir my name  is chinmay");
		while(st.hasMoreElements())
		{
			String ss = (String) st.nextElement();
			System.out.println(ss);
			
		}
	}

}
