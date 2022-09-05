import java.io.*;
public class Deserialisation1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		FileInputStream fis = new FileInputStream("gokate.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializationEmp s = (SerializationEmp)ois.readObject();
		System.out.println(s.empid + "   "+ s.name);
		ois.close();
	}

}
