package com.ni.jdbc.BatchProcessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessingTest 
{
	public static void main(String[] args) 
	{
		try(Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
				Statement st=con.createStatement();)
		{
			st.addBatch("insert into Student values(8,'SUHAS','AKOLA',68.98)");
			st.addBatch("update student set savg=66.99 where sid=7");
			st.addBatch("delete from student where sid=9");
			
			int result[]=st.executeBatch();
			//process
			int sum=0;
			for(int i=0;i<result.length;i++)
			{
				sum=sum+result[i];
				System.out.println(sum);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	
	
}

