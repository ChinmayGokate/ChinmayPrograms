package com.ni.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/* java app to get employee detail based on given initial character of employee name.*/

public class SelectTest1 
{
	public static void main(String args[])
	{
		Scanner sc=null;
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try
		{
			sc= new Scanner(System.in);
			String initialChar=null;
			if(sc!=null)
			{
				
				System.out.println("Enter the innitial character of employee");
				initialChar=sc.next().toUpperCase();
			}
			//Convert input value to required SQL Query
			initialChar="'"+initialChar+"%'";  //'s%'
			
			//established Connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##gokate","oracle");
			// create statement
			if(con!=null)
				st=con.createStatement();
			//execute Query
			String query="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE ENAME LIKE "+initialChar;
			System.out.println(query);
			if(st!=null)
				
				rs=st.executeQuery(query);
			//PROCESS
			if(rs!=null)
			{//while(rs.next()!=false)
			boolean flag=false;
			while(rs.next())
			{	
				flag=true;
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
			if(flag==false)
			{
				System.out.println("NO Records found");
			}
			}
		}
		catch(SQLException se)
		{
			if(se.getErrorCode()>=900 && se.getErrorCode()<=999)
				System.out.println("Invalid column name or table name or SQL keyword");
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
			try
			{
				sc.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
