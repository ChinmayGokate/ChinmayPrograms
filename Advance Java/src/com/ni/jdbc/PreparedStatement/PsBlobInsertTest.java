package com.ni.jdbc.PreparedStatement;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PsBlobInsertTest 
{
	private static final String INSERT_BLOB="INSERT INTO ARTIST_INFO VALUES(SEQ1.NEXTVAL,?,?,?)";
	public static void main(String[] args) 
	{
		//input name add photo
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("enter atist name");
			String aName=sc.nextLine();
			System.out.println("Enter artist address");
			String aAdd=sc.nextLine();
			System.out.println("enter photo location");
			String location=sc.nextLine().replace("?","");
			
			try(InputStream is=new FileInputStream(location))
			{
				try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
					PreparedStatement ps=con.prepareStatement(INSERT_BLOB))
				{
					ps.setString(1, aName);
					ps.setString(2, aAdd);
					ps.setBinaryStream(3, is);
					
					int count=ps.executeUpdate();
					
					if(count==0)
					{
						System.out.println("record not inserted");
					}
					else
					{
						System.out.println("records are inserted");
					}
					
				}
				catch(SQLException se)
				{
					se.printStackTrace();
				}
			
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
