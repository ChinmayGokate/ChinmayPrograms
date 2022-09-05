package association.composition;

public class Car 
{
	String color;
	int noOfTyres;
	
	Engine engine;
	
	Car(String color,int noOfTyres,String engineType,String engineName,String enginePower)
	{
		this.engine=new Engine();
		this.color=color;
		this.noOfTyres=noOfTyres;
		engine.engineType=engineType;
		engine.engineName=engineName;
		engine.enginePower=enginePower;
	}

	public void display()
	{
		System.out.println(color);
		System.out.println(noOfTyres);
		System.out.println(engine.engineType);
		System.out.println(engine.engineName);
		System.out.println(engine.enginePower);
		
	}
	public static void main(String[] args) {
		
		Car c=new Car("red", 4, "turbo", "tata", "1500");
		c.display();
	}
	
	
}
