import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStream2 {
	public static void main(String[] args) throws IOException
	{
		{
			FileOutputStream fos = new FileOutputStream("anurag1.txt");
			String s = "anurag is my brother";
			byte[] b = s.getBytes();
			fos.write(b);
		}
	}
}
