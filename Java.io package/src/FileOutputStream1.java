import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStream1 {

	public static void main(String args[]) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("anurag.txt");
		fos.write(70);
		fos.close();
		System.out.println("check anurag.txt file");
	}
}
