package com.ni.jdbc.MetaData;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataTest 
{
	public static void main(String[] args) 
	{
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
			Statement st=con.createStatement();
			 	ResultSet rs=st.executeQuery("Select * from student"))
		{
			//create the objec of ResultSetMetaData
			ResultSetMetaData rsmd=rs.getMetaData();
			if(rsmd!=null)
			{
				int count=rsmd.getColumnCount();
				System.out.println("columns in table ::::"+count);
				for(int i=1;i<=count;i++)
				{
					System.out.print(rsmd.getColumnName(i)+" ");
				}
				System.out.println();
				for(int i=1;i<=count;i++)
				{
					System.out.print(rsmd.getColumnTypeName(i)+" ");
					//System.out.print("("+rsmd.getColumnType(i)+")"+" ");
				}
				System.out.println();
				while(rs.next())
				{
					System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
					
				}
				
				
			}
		
		}
		catch (SQLException se) 
		{
			se.printStackTrace();
		}
	}
}
