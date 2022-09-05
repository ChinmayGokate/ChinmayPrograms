import java.io.File;

public class CreateDirectory {
	public static void main(String[] args) {
		File f = new File("Chiu");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
		
	}
}
