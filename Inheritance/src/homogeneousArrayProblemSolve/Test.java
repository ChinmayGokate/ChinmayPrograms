package homogeneousArrayProblemSolve;

public class Test
{
	public static void main(String[] args) 
	{
	  Object[] ob=new Object[10];
	  	ob[0]= new Parent();
	  	ob[1]= new Student();
	  	ob[2]= new Teacher();
	  	ob[3]= new Animal();
	  	ob[4]= new Tiger();
	  	ob[5]= new Cat();
	  	ob[6]= new Dog();
	  	ob[7]= 10;
	  	ob[8]= 'A';
	  	ob[9]= 50.90;
	  	
	  	for(int i=0;i<ob.length;i++)
	  		System.out.println(ob[i]);
	}
}
