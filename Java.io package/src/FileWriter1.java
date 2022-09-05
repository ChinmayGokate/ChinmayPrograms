import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("Anu.txt");
		fw.write("my java class");
		System.out.println("success");
		fw.close();
	}
}
