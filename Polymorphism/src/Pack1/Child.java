package Pack1;

class Animal
{
	
}
class Dog extends Animal
{
	
}

class Parent 
{
	Animal m1()
	{
		System.out.println("parent");
		return new Animal();
	}
}
public class Child extends Parent
{

	Dog m1()
	{
		System.out.println("child");
		return new Dog();
	}
	public static void main(String[] args) 
	{
		
		Child c= new Child();
		c.m1();
	}
}
