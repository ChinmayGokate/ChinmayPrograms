package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams 
{
	void operation1() throws Exception
	{
		System.out.println("file reading....");
		FileInputStream fis = new FileInputStream("D:\\Eclipse Workspace\\Java.io package\\file1");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println();
		System.out.println("file Reading Completed");
	}
	void operation2() throws FileNotFoundException
	{
		FileOutputStream fos=new FileOutputStream("file2.txt");
	}
	public static void main(String[] args) throws Exception
	{
		ByteStreams bs=new ByteStreams();
		bs.operation1();
	}
}
