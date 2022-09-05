package association.aggregation;

public class Student 
{
	int sId;
	String sName;
	Address a;
	Parents p;
	Marks m;

//	static Address a=new Address(102, "Akola");
//	static Marks m=new Marks(65, 70, 50);
//	static Parents p= new Parents("Anilrao", "Sangita");

	
	Student(int sId,String sName,Address a,Parents p,Marks m)
	{
		this.sId=sId;
		this.sName=sName;
		this.a=a;
		this.p=p;
		this.m=m;
	}
	public void display()
	{
		System.out.println(sId);
		System.out.println(sName);
		System.out.println(a);
		System.out.println(p);
		System.out.println(m);
	}
	public static void main(String[] args) {
		Address a=new Address(102, "Akola");
		Marks m=new Marks(65, 70, 50);
		Parents p= new Parents("Anilrao", "Sangita");
		p.parents();
		new Student(1, "chinmay", a, p, m).display();
	}
}
