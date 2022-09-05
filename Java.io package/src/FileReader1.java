import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("Anu.txt");
		int s;
		while((s= fr.read())!=-1) {
		System.out.println((char)s);
		}
		fr.close();
	}
}
