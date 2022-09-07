package com.ni.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
	
/*Converting Sql date format to String date format*/
	public class PsDateRetriveTest  
	{
		private static final String SELECT_QUERY ="SELECT PID,PNAME,DOM,DOJ,DOB,PADD FROM PERSON_INFO_DATES";
		public static void main(String[] args) 
		{
			
			Connection con= null;
			PreparedStatement ps=null;
			ResultSet rs=null;
			try
			{
		
			
				
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
			
				ps=con.prepareStatement(SELECT_QUERY);
				
				if(ps!=null)
					rs=ps.executeQuery();
				
				//process
//				if(rs!=null)
//					while(rs.next())
//						{
//							System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDate(3)+" "+rs.getDate(4)+" "+rs.getDate(5)+" "+rs.getString(6));
//						}
			if(rs!=null)
				while(rs.next())	
				{
					int sId=rs.getInt(1);
					String sName=rs.getString(2);
					java.sql.Date sdob=rs.getDate(3);
					java.sql.Date sdoj=rs.getDate(4);
					java.sql.Date sdom=rs.getDate(5);
					String sadd=rs.getString(6);
					
		// Converting Sql date format to String date format
					SimpleDateFormat sgf=new SimpleDateFormat("dd-MM-yyyy");
					String ssdob=sgf.format(sdob);
					String ssdoj=sgf.format(sdoj);
					String ssdom=sgf.format(sdom);
					
					System.out.println(sId+" "+sName+" "+ssdob+" "+ssdoj+" "+ssdom+" "+sadd);
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
					con.close();
				}
				catch(SQLException se)
				{
					se.printStackTrace();
				}
				
			}
		}
	}





























