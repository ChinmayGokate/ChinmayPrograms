package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Student
{
	String studentId;
	String studentName;
	String studentDept;
	
	public Student(String studentId, String studentName, String studentDept) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentDept = studentDept;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentDept=" + studentDept
				+ "]";
	}
}

public class MyArrayListMyObject 
{
	void ArrayListByMyObject()
	{
		System.out.println("passing our class Objects into Arraylist ");
		ArrayList<Student> al=new ArrayList<Student>();
		Student s1=new Student("101","Chinmay","Developing");
		Student s2=new Student("102","Anurag","Testing");
		Student s3=new Student("103","Anilrao","Mechanical");
		Student s4=new Student("104","Sangita","HomeMinister");
		Student s5=new Student("105","Neha","Devoloping");
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		System.out.println(al);
		System.out.println("==============================");
		
		System.out.println("Reterivng the Data by using Iterator Interface");
		System.out.println();
		Iterator<Student> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("=====================");
		System.out.println("by using ListItorator");
		ListIterator<Student> i1=al.listIterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}
	
	public static void main(String[] args) 
	{
		MyArrayListMyObject ml=new MyArrayListMyObject();
		ml.ArrayListByMyObject();
	}
}
