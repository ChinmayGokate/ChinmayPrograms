package com.ni.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
	
/*Converting Sql date format to String date format*/
	public class PsDateRetriveTest1 
	{
		private static final String SELECT_QUERY ="SELECT PID,PNAME,DOM,DOJ,DOB,PADD FROM PERSON_INFO_DATES WHERE DOB>=? AND DOB<=?";
		//private static final String SELECT_QUERY ="SELECT PID,PNAME,DOM,DOJ,DOB,PADD FROM PERSON_INFO_DATES WHERE DOB>='21-jan-1980' AND DOB<='21-feb-2022'";
		public static void main(String[] args) 
		{
			Scanner sc=null;
			Connection con= null;
			PreparedStatement ps=null;
			ResultSet rs=null;
			try
			{
				//read date
				sc=new Scanner(System.in);
				String sdob=null,edob=null;
				if(sc!=null)
				{
					System.out.println("Enter starting DOB dd-MM-yyyy");
					sdob=sc.nextLine();
					System.out.println("Enter Ending DOB dd-MM-yyyy");
					edob=sc.nextLine();
				}
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
//				java.util.Date ud=sdf.parse(sdob);
//				java.util.Date ud1=sdf.parse(edob);
//				
//				long ms=ud.getTime();
//				long ms1=ud1.getTime();
//				
//				java.sql.Date sd=new java.sql.Date(ms);
//				java.sql.Date sd1=new java.sql.Date(ms1);
			
				java.sql.Date sdo=new java.sql.Date(sdf.parse(sdob).getTime());
				java.sql.Date sdo1=new java.sql.Date(sdf.parse(edob).getTime());
				
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##GOKATE","oracle");
			
				ps=con.prepareStatement(SELECT_QUERY);
			
				
				if(ps!=null)
				{
					ps.setDate(1, sdo);
					ps.setDate(2, sdo1);
				
					rs=ps.executeQuery();
					System.out.println("eeeeeeeeeeeeeeee");
					//System.out.println(rs);
				}
				//process
				if(rs!=null)
				{ System.out.println("sssssssssss");
					
					System.out.println(rs.isBeforeFirst());
					while(rs.next()!=false)
					{
							System.out.println("nnnnnnnnnnnnnnnn");
							System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDate(3)+" "+rs.getDate(4)+" "+rs.getDate(5)+" "+rs.getString(6));
					}
				}
		/*	if(rs!=null)
				while(rs.next())	
				{
					int sId=rs.getInt(1);
					String sName=rs.getString(2);
					java.sql.Date sdob1=rs.getDate(3);
					java.sql.Date sdoj=rs.getDate(4);
					java.sql.Date sdom=rs.getDate(5);
					String sadd=rs.getString(6);
					
		// Converting Sql date format to String date format
					SimpleDateFormat sgf=new SimpleDateFormat("dd-MM-yyyy");
					String ssdob=sgf.format(sdob1);
					String ssdoj=sgf.format(sdoj);
					String ssdom=sgf.format(sdom);
					
					System.out.println(sId+" "+sName+" "+ssdob+" "+ssdoj+" "+ssdom+" "+sadd);
				} */
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






























