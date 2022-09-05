package com.ni.jdbc.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTableTest 
{
	public static void main(String[] args) 
	{
		Connection con=null;
		Statement st=null;
		try
		{
		//Connection
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
		
		//createStatement
		if(con!=null)
			st=con.createStatement();
		
		//prepare query
		//drop table Test_Student ;
		String query="DROP TABLE TEST_STUDENT";
		System.out.println(query);
		//execute sql query
		int count=0;
		if(st!=null) 
			count=st.executeUpdate(query);
		//System.out.println(count);
		//process
		if(count==0)
		{
			System.out.println("Table is Deleted");
		}
		else
		{
			System.out.println("Table is not Deleted");
		}
		
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			
			try
			{
				if(st!=null)
					st.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			
			try
			{
				if(con!=null)
					con.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
		}
	}
}
