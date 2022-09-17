package com.ni.jdbc.MetaData;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DataBaseMetaDataTest 
{
	public static void main(String[] args) 
	{
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");)
		{
			//create object of DatabaseMetaData
			DatabaseMetaData dbmd=con.getMetaData();
			if(dbmd!=null)
			{
				System.out.println(dbmd.getDatabaseProductVersion());
				System.out.println(dbmd.getDatabaseProductName());
				System.out.println(dbmd.getDriverName());
				System.out.println(dbmd.getURL());
				System.out.println(dbmd.getUserName());
		
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
