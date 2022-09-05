import java.io.*;

public class CreateNewFile {
	public static void main(String[] args) throws IOException {
		File f = new File("chinmay.txt");
		boolean b = f.createNewFile();
		System.out.println(b);
		if(b)
		{
			System.out.println("yes successfully created");
		}
		else
		{
			System.out.println("already exists");
		}
		
		// or
		
		File fl = new File("anu.txt");
		System.out.println(fl.exists()); 
		f.createNewFile();
		System.out.println(fl.exists());
	}
}
