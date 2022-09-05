import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
	public static void main(String[] args) throws IOException
	{
		System.out.println("reading ");
		FileInputStream fis = new FileInputStream("abc.txt");
		//FileOutputStream fos = new FileOutputStream("chinmay2.txt");
		int c;
		while((c =fis.read())!=-1)
		{
			System.out.print((char)c);
			//fos.write(c);
		}
			}
	}
