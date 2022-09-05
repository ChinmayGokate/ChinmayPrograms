package com.ni.jdbc.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AlterTableTest 
{
	public static void main(String[] args) 
	{
		Connection con=null;
		Statement st=null;
		try
		{
		//Connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
			
		//createstatement
			if(con!=null)
				st=con.createStatement();
		//prepare sql query
			//add    ==> ALTER TABLE STUDENT ADD(DOB DATE);
			//drop   ==> ALTER TABLE STUDENT DROP(DOB);
			//rename ==> ALTER TABLE STUDENT RENAME COLUMN DOB TO DOB1;
			//modify ==> ALTER TABLE STUDENT MODIFY(MARKS NUMBER(4));
			String query="ALTER TABLE STUDENT MODIFY(MARKS NUMBER(4))";
			System.out.println(query);
		//send and execute sq query
			int count=0;
			if(st!=null)
				count=st.executeUpdate(query);
		//process
			if(count==0)
			{
				System.out.println("Success");
			}
			
		}catch(SQLException se)
		{
			if(se.getErrorCode()>=900 && se.getErrorCode()<=999)
			{
				System.out.println("Invalid col name or table name or sql keyword");
			}
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
