package com.ni.jdbc.ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdatableRsTest 
{
	private static final String UPDATABLERS_QUERY="SELECT SID,SNAME,SADD,SAVG FROM STUDENT";
	public static void main(String[] args) 
	{
		try(Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
				PreparedStatement ps=con.prepareStatement(UPDATABLERS_QUERY,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
				ResultSet rs=ps.executeQuery())
		{
			//gather the resultset object
			while(rs.next())
			{
				System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3)+rs.getString(4));
			}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
			//update date by  using update --result set
			rs.absolute(3);
			rs.updateFloat(4,86.88f);
			rs.updateRow();
			rs.beforeFirst();;
			while(rs.next())
			{
				System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3)+rs.getString(4));
			}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
			//insert data
//			rs.moveToInsertRow();
//			rs.updateInt(1, 11);
//			rs.updateString(2, "gautam");
//			rs.updateString(3, "mumbai");
//			rs.updateFloat(4, 65.45f);
//			rs.insertRow();
//			System.out.println("Record Inserted");
//			while(rs.next())
//			{
//				System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3)+rs.getString(4));
//			}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
			//delete data
//			rs.absolute(6);
//			rs.deleteRow();
//			System.out.println("Record Deleted");
//			rs.beforeFirst();
//			while(rs.next())
//			{
//				System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3)+rs.getString(4));
//			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
