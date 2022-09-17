package com.ni.jdbc.Rowsets;

import java.sql.SQLException;

import oracle.jdbc.rowset.OracleCachedRowSet;

public class OracleCachedRowsetTest 
{
	public static void main(String[] args) {
		try(OracleCachedRowSet ocrs= new OracleCachedRowSet();)
		{
			ocrs.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
			ocrs.setUsername("C##GOKATE");
			ocrs.setPassword("oracle");
			ocrs.setCommand("select * from student");
			ocrs.execute();
			
			while(ocrs.next())
			{
				System.out.println(ocrs.getString(1)+" "+ocrs.getString(2)+" "+ocrs.getString(3)+" "+ocrs.getString(4));
			}
			
			System.out.println("stop DB s/w from service.msc");
			Thread.sleep(20000);
			//update data
			ocrs.absolute(7);
			ocrs.updateFloat(4, 77.88f);
			ocrs.updateRow();
			System.out.println("Offline modification is happen");
			System.out.println("start db s/w from service.msc");
			Thread.sleep(20000);
			ocrs.acceptChanges();
			while(ocrs.next())
			{
				System.out.println(ocrs.getString(1)+" "+ocrs.getString(2)+" "+ocrs.getString(3)+" "+ocrs.getString(4));
			}
			
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
