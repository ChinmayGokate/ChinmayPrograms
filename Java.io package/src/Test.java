import java.io.File;
import java.io.IOException;
public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("anu.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
	}

}
