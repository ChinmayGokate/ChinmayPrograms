package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;



class StudentDetail
{
	String studentId;
	String studentName;
	public StudentDetail(String studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student1 [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
}

public class MyHashSet 
{
	public void myHashSet()
	{
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add("java");
		hs.add(null);
		hs.add(29);
		hs.add(10);
		hs.add(100);
		hs.add(47);
		hs.add(null);
		hs.add(1);
		hs.add(93);
		System.out.println(hs);
		
		System.out.println("By Using Iterator");
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}System.out.println();
		System.out.println("===========================");
		
		System.out.println("By Using ListIterator");
		ArrayList al=new ArrayList(hs);
		ListIterator li=al.listIterator();
		while(li.hasNext())
		{
			System.out.print(li.next()+" ");
		}System.out.println();
		
	}
	public void MyHashSetObject()
	{
		HashSet<StudentDetail> hs1=new HashSet<>();
		hs1.add(new StudentDetail("101","Chinmay"));
		hs1.add(new StudentDetail("102","Gokote"));
		
		System.out.println("by Using Iterator");
		Iterator<StudentDetail> i=hs1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("=======================");
		System.out.println("By using Vector");
		Vector<StudentDetail> v=new Vector<StudentDetail>(hs1);
		Enumeration<StudentDetail> e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	}
	public static void main(String[] args) 
	{
		MyHashSet mhs=new MyHashSet();
		mhs.myHashSet();
		mhs.MyHashSetObject();
	}
}
