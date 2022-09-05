import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("xyz.txt"));
		int c;
		while((c=bis.read())!=-1)
		{
			System.out.println((char)c);
		}
		
	}

}
