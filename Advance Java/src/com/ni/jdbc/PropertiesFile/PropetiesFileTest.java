package com.ni.jdbc.PropertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class PropetiesFileTest 
{
	private static final String QUERY="select * from student";
	public static void main(String[] args) 
	{
		Properties props = null;
		try(InputStream is=new FileInputStream("src/jdbc.properties"))
		{
			props=new Properties();
			props.load(is);
		}
		catch (FileNotFoundException fnfe) 
		{
			fnfe.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		try(Connection con=DriverManager.getConnection(props.getProperty("jdbc.url"),
													   props.getProperty("jdbc.username"),
													   props.getProperty("jdbc.pwd"));
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(QUERY))
		{
			if(rs!=null)
				while(rs.next())
				{
					System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
				}
		}
		catch (SQLException se) 
		{
			se.printStackTrace();
		}
	}
}
