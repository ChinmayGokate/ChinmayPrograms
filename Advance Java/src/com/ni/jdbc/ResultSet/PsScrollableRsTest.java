package com.ni.jdbc.ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PsScrollableRsTest 
{
	private static final String RS_SCROLLABLE_QUERY="SELECT SID,SNAME,SADD,SAVG FROM STUDENT";
	public static void main(String[] args) 
	{
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
				PreparedStatement ps=con.prepareStatement(RS_SCROLLABLE_QUERY,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
				ResultSet rs=ps.executeQuery();)
		{
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
			}
			System.out.println("=======================================");
			rs.afterLast();
			while(rs.previous())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
			}
			System.out.println("=======================================");
			rs.first();
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
			System.out.println("=======================================");
			rs.last();
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
			System.out.println("=======================================");
			rs.absolute(3);
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
			System.out.println("=======================================");
			rs.relative(2);
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
			System.out.println("=======================================");
			rs.absolute(-3);
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
			System.out.println("=======================================");
			rs.relative(-2);
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4));
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
