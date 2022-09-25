package collection;

public class TestCustomCollection 
{
	public static void main(String[] args) 
	{
		CustomCollection cc= new CustomCollection();
		cc.add("a");
		cc.add("b");
		cc.add(10);
		cc.add("a");
		cc.add(10);
		cc.add(40.8);
		System.out.println("Capacity ::::"+cc.getCapacity());
		System.out.println("Size ::::"+cc.size());
		System.out.println("get()::::"+cc.get(5));
		System.out.println(cc);
	}
	
}
