package com.ni.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracletToMySqlDataTransfer 
{
	private static final String ORACLE_SELECT="SELECT SID,SNAME,SADD,SAVG FROM STUDENT";
	private static final String MYSQL_INSERT="INSERT INTO STUDENT VALUES(?,?,?,?)";
	public static void main(String[] args) 
	{
		Connection oracleCon=null;
		Connection mysqlCon=null;
		Statement st=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try
		{
			//register jdbc driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//establish connection
			oracleCon=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
			mysqlCon=DriverManager.getConnection("jdbc:mysql:///AdvanceJava","root","Sql123456@");
			
			//create statement
			st=oracleCon.createStatement();
			ps=mysqlCon.prepareStatement(MYSQL_INSERT);
			
			//execute select query
			rs=st.executeQuery(ORACLE_SELECT);
			
			//process
			if(rs!=null && ps!=null)
			{
			while(rs.next())
			{
				int sId=rs.getInt(1);
				String sName=rs.getString(2);
				String sAdd=rs.getString(3);
				float sAvg=rs.getFloat(4);
				
				ps.setInt(1, sId);
				ps.setString(2, sName);
				ps.setString(3, sAdd);
				ps.setFloat(4, sAvg);
				
				ps.executeUpdate();
			}
			System.out.println("data copy successfully");
			}
				
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			System.out.println("data Not copy successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("problem in app esecution");
		}
		finally
		{
			try {
				rs.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			try {
				ps.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			try {
				mysqlCon.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			try {
				oracleCon.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			try {
				st.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			
		}
	
	}
}
