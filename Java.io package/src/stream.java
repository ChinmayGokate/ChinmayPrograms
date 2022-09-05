import java.io.File;
import java.io.IOException;

public class stream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("chinmay.txt");
		boolean i = f.createNewFile();
		if(i)
		{
			System.out.println("file successfully create");
		}
		else
		{
			System.out.println("file is already exists");
		}
	
		File f1 = new File("chinmay1.txt");
		System.out.println(f1.exists());
		f1.createNewFile();
		System.out.println(f1.exists());
		boolean b = f1.canRead();
		System.out.println(b);
	}

}
