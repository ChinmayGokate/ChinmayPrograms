package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList 
{
	void arrayListMethods()
	{
		System.out.println("Implementing arraylist");
		ArrayList al=new ArrayList();
		//ArrayList<Integer> al1=new ArrayList<Integer>();
		al.add(10);
		al.add("Java");
		al.add(null);
		al.add(34);
		al.add(87);
		al.add(10);
		al.add(1);
		al.add(12);
		System.out.println("Arraylist: "+al);
		
		System.out.println("Size()==="+al.size());
		System.out.println("isEmpty()==="+al.isEmpty());
		//al.clear();
		//System.out.println("After Clear==isEmpty()==="+al.isEmpty());
		System.out.println("contains()==="+al.contains("Java"));
		System.out.println("remove()==="+al.remove(3));
		System.out.println("remove()==="+al.remove((Object)87));
		System.out.println("ArrayList: "+al);
		
		al.add(2,38);
		System.out.println("ArrayList: "+al);
		
		System.out.println("get()==="+al.get(3));
		
		System.out.println("Reteriving the elements using for loopp");
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("Reteriving the elements using foreach loopp");
		for(Object o:al)//(int o:al) // (Integer o:al)
		{
			System.out.print(o+" ");
		}
		System.out.println();
		
		System.out.println("Reteriving the elements using Iterative Interface");
		Iterator i=al.iterator();
		//Iterator<Integer> i=al.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) 
	{
		MyArrayList mal=new MyArrayList();
		mal.arrayListMethods();
	}
}
