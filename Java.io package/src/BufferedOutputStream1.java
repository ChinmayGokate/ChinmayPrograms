 import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream1 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("xyz.txt"));
		String str = "my first buffered example";
		byte[] i = str.getBytes();
		bos.write(i);
		bos.close();
	}

}
