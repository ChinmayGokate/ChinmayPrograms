package collection;

import java.util.Arrays;

public class CustomCollection 
{
	private Object[] objArray = new Object[5];
	int elementCount=0;
	public void add(Object obj)
	{
		if(elementCount==objArray.length)
		{
			increaseCapacity();
		}
		objArray[elementCount]=obj;
		elementCount++;
	}
	public void increaseCapacity()
	{
		int intCapacity=objArray.length*2;
		Object nextArray[]=new Object[intCapacity];
		for(int i=0;i<objArray.length;i++)
		{
			nextArray[i]=objArray[i];
		}
		objArray=nextArray;
	}
	
	public int getCapacity()
	{
		return objArray.length;
	}
	public int size()
	{
		return elementCount;
	}
	public Object get(int index)
	{
		if(index<0 || index>=size())
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		return objArray[index];
	}
	@Override
	public String toString() {
		return "CustomCollection [objArray=" + Arrays.toString(objArray) + "]";
	}
	
}
