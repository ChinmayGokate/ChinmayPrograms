import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter1 {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
		bw.write("My Best programing language is java.\ni am very good in java programing.\ni am technically strong in java.");
		bw.close();
	
	}

}
