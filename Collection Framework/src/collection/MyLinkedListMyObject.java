package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

class Employee
{
	String empid;
	String empname;
	public Employee(String empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
}
public class MyLinkedListMyObject 
{
	void MyObjects()
	{
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("101","Chinmay"));
		al.add(new Employee("102","Anurag"));
		al.add(new Employee("103","Anilrao"));
		
		System.out.println(al);
		System.out.println("======================");
		System.out.println("By using Iterator");
		Iterator<Employee> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("=====================");
		System.out.println("by using ListItorator");
		ListIterator<Employee> i1=al.listIterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
	public static void main(String[] args) 
	{
		MyLinkedListMyObject ml=new MyLinkedListMyObject();
		ml.MyObjects();
	}
}
