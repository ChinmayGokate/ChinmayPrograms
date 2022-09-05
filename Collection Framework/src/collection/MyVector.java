package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

class Vehicle
{
	String no_Of_Tires;
	String vehicle_Type;
	
	public Vehicle(String no_Of_Tires, String vehicle_Type) {
		super();
		this.no_Of_Tires = no_Of_Tires;
		this.vehicle_Type = vehicle_Type;
	}

	@Override
	public String toString() {
		return "Vehicle [no_Of_Tires=" + no_Of_Tires + ", vehicle_Type=" + vehicle_Type + "]";
	}
	
}
public class MyVector 
{
	public void myVector()
	{
		Vector ve=new Vector();
		ve.add(10);
		ve.add("java");
		ve.add(null);
		ve.add(56);
		ve.add(10);
		ve.add(51);
		ve.add(1);
		System.out.println(ve);
		System.out.println("Retriving the Data by using Enumeration Interface");
		Enumeration e=ve.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+" ");
		}
		System.out.println();
		
		System.out.println("by using Iterator interface");
		Iterator i=ve.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println();
		
		System.out.println("by Using ListIterator interface");
		ListIterator li=ve.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}
		System.out.println();
	}
	public void myVectorMyObject()
	{
		Vector<Vehicle> ve=new Vector<Vehicle>();
		ve.add(new Vehicle("2","Bike"));
		ve.add(new Vehicle("3","Auto"));
		ve.add(new Vehicle("4","Car"));
		System.out.println("===========================");
		
		System.out.println(ve);
		System.out.println("Retriving the Data by using Enumeration Interface");
		Enumeration e=ve.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement()+" ");
		}
		System.out.println();
		
		System.out.println("by using Iterator interface");
		Iterator i=ve.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next()+" ");
		}
		System.out.println();
		
		System.out.println("by Using ListIterator interface");
		ListIterator li=ve.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next()+" ");
		}
		
	}
	public static void main(String[] args) 
	{
		MyVector mv=new MyVector();
		mv.myVector();
		mv.myVectorMyObject();
		
		
	}
}
