import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization1 
{
	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		SerializationEmp e = new SerializationEmp(20,"chinmay");
		
		FileOutputStream fos = new FileOutputStream("gokate.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
		
	System.out.println("Serialization is complete");
	}

}
