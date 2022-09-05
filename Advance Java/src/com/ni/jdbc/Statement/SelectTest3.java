package com.ni.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.CountDownLatch;
import java.sql.SQLException;

public class SelectTest3 
{
	public static void main(String[] args) 
	{
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try
		{
			//Connection 
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##gokate","oracle");
			
			//createStatement
			if(con!=null)
				st=con.createStatement();
			
			//execute query
			String query1="SELECT EMPNO,ENAME,JOB,DEPTNO,SAL FROM EMP WHERE SAL=(SELECT MAX(SAL) FROM EMP)";
			String query2="SELECT EMPNO,ENAME,JOB,DEPTNO,SAL FROM EMP WHERE SAL=(SELECT MIN(SAL) FROM EMP)";
			String query3="SELECT COUNT(*) FROM EMP";
			String query4="SELECT SID,SNAME,SADD,SAVG FROM STUDENT";
			System.out.println(query4);
			if(st!=null)
				rs=st.executeQuery(query4);
			
			//process (0 or more record --> use While)
			if(rs!=null)
			{	
				boolean flag=false;
				while(rs.next())// 
				{
					flag=true;
					//for query 1 and 2
					//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getFloat(5));
					//for query4
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
				}
				if(flag==false)
				{
					System.out.println("No Records found");
				}
			//process (1 result only) for query3
		// COUNT HOW MANY RECORDS ARE PRESENT IN EMP TABLE
//			if(rs!=null)
//			{
//				rs.next();
//				int count=rs.getInt("COUNT(*)");
//				System.out.println("Records count in emp table: "+count);
//			}
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
				rs.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			
			try
			{
				st.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			
			try
			{
				con.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			
		}
	}
}
