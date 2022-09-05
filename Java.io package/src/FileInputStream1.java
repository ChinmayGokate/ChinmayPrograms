import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream1 {
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("chinmay.txt");
		int c;
		while((c =fis.read())!=-1)
		{
			System.out.println((char)c);
			
		}
			}
	}
