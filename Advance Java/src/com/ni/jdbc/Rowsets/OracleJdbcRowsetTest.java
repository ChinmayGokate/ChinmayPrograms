package com.ni.jdbc.Rowsets;

import java.sql.SQLException;

import oracle.jdbc.rowset.OracleJDBCRowSet;

public class OracleJdbcRowsetTest 
{
	public static void main(String[] args) {
		try(OracleJDBCRowSet ojrs= new OracleJDBCRowSet();)
		{
			ojrs.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
			ojrs.setUsername("C##GOKATE");
			ojrs.setPassword("oracle");
			ojrs.setCommand("select * from student");
			ojrs.execute();
			
			while(ojrs.next())
			{
				System.out.println(ojrs.getString(1)+" "+ojrs.getString(2)+" "+ojrs.getString(3)+" "+ojrs.getString(4));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
