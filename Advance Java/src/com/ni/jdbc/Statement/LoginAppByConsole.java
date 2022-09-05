package com.ni.jdbc.Statement;
//Eclipse IDE is not Still supporting console class ..so use scanner class in Eclipse IDE
import java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LoginAppByConsole 
{
	public static void main(String[] args) 
	 {
		//read input
		 Console cons=null;
		 Connection con=null;
		 Statement st=null;
		 ResultSet rs=null;
		try
		{//Eclipse IDE is not Still supporting console class
			cons=System.console();
			String uname=null,pwd=null;
			if(con!=null)
			{
				System.out.println("enter your Username :");
				uname=cons.readLine();
				System.out.println("enter your password :");
				pwd=new String(cons.readPassword());
			}
		// converting
			uname="'"+uname+"'";
			pwd="'"+pwd+"'";
		//Load jdbc Driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
		//connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
			
		//createStatement
			if(con!=null)
			{
				st=con.createStatement();
			}
		//prepare sql query
			//SELECT COUNT(*) FROM IRCTC WHERE UNAME='CHINMAY' AND PWD='C1';
			String query="SELECT COUNT(*) FROM IRCTC WHERE UNAME="+uname+" AND PWD="+pwd;
			System.out.println(query);
		//send abd execute sql query 
			if(st!=null)
			{
				rs=st.executeQuery(query);
			}
		// process resultset obj
			if(rs!=null)
			{
				rs.next();
				int count=rs.getInt(1);
				System.out.println(count);
		//process result
				if(count==0)
				{
					System.out.println("Invalid Credential");
				}
				else
				{
					System.out.println("valid Credential");
				}
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
				if(rs!=null)
					rs.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
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
