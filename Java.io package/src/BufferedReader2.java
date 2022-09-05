import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader2 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("chiu.txt"));
		String c;
		while((c=br.readLine())!=null)
		{
			System.out.println(c);
		}
		br.close();
	}

}
