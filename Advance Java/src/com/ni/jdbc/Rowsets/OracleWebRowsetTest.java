package com.ni.jdbc.Rowsets;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.SQLException;

import oracle.jdbc.rowset.OracleWebRowSet;

public class OracleWebRowsetTest 
{
	public static void main(String[] args) {
		try(OracleWebRowSet owrs= new OracleWebRowSet();)
		{
			owrs.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
			owrs.setUsername("C##GOKATE");
			owrs.setPassword("oracle");
			owrs.setCommand("select * from student");
			owrs.execute();
			
			while(owrs.next())
			{
				System.out.println(owrs.getString(1)+" "+owrs.getString(2)+" "+owrs.getString(3)+" "+owrs.getString(4));
			}
			
			System.out.println("++++++++++++++++++++++++++++++++++");
			//write theDB table record as xml contain to xml file
			OutputStream os=new FileOutputStream("student.xml");
			owrs.writeXml(os);
			System.out.println("Writing DB table record to xml file is completed ");
			System.out.println("++++++++++++++++++++++++++++++++++++++++");
			//write the db table records as xml contain to console
			owrs.writeXml(System.out);
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
