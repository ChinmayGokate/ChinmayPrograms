package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Vector;

class Students
{
	String studentId;
	String studentName;
	
	public Students(String studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
}
public class MyLinkedHashSet 
{
	public void myLinkedHashSet()
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(10);
		lhs.add("Java");
		lhs.add(null);
		lhs.add(37);
		lhs.add(45);
		lhs.add(10);
		lhs.add(1);
		lhs.add(10);
		lhs.add(null);
		System.out.println(lhs);
		
		System.out.println("Retrieving the data by Using Iterator");
		Iterator i=lhs.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}System.out.println();	
	}
	public void myLinkedHashSetObject()
	{
		LinkedHashSet<Students> lhs=new LinkedHashSet<Students>();
		lhs.add(new Students("101", "Chinmay"));
		lhs.add(new Students("102", "Gokate"));
		System.out.println();
		System.out.println("Retrieving the Data by Using Iterator");
		Iterator<Students> i=lhs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println();
		System.out.println("Retrieving the data by Using Enumeration");
		Vector<Students> v=new Vector<Students>(lhs);
		Enumeration<Students> elements = v.elements();
		while(elements.hasMoreElements())
		{
			System.out.println(elements.nextElement());
		}
	}
	public static void main(String[] args) 
	{
		MyLinkedHashSet ml=new MyLinkedHashSet();
		ml.myLinkedHashSet();
		ml.myLinkedHashSetObject();
	}
}
