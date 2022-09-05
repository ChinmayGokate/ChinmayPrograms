package com.ni.jdbc.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableTest 
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
		//create table Test_Student (sno number(4) primary key,sname varchar2(20),sadd varchar2(50);
		String query="CREATE TABLE TEST_STUDENT (SNO NUMBER(4) PRIMARY KEY,SNAME VARCHAR2(20),SADD VARCHAR2(50))";
		System.out.println(query);
		//execute sql query
		int count=0;
		if(st!=null) 
			count=st.executeUpdate(query);
		//System.out.println(count);
		//process
		if(count==0)
		{
			System.out.println("Table is Created");
		}
		else
		{
			System.out.println("Table is not Created");
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
