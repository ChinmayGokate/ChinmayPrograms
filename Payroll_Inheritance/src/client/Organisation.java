package client;

import entity.Employee;
import entity.Manager;
import entity.Sourcing;
import entity.Trainer;
import util.TaxUtil;



public class Organisation 
{
	public static void main(String[] args) 
	{
		
		Employee e=new Employee(101, "chinmay", 10000, 1000, 500);
		TaxUtil t1=new TaxUtil();
		double et=t1.calculateTax(e);
		System.out.println(et);
		
		Manager m=new Manager(101, "Chinmay", 30000, 1000, 1000, 5000);
		double mt=t1.calculateTax(m);
		System.out.println(mt);
		
		Trainer t =new Trainer(101,"chinmay",25000,750, 500, 5, 10);  	
		double tt=t1.calculateTax(t);
		System.out.println(tt);
		
		Sourcing s=new Sourcing(101, "chinmay",30000, 1000, 500, 10, 8, 9);
		double st=t1.calculateTax(s);
		System.out.println(st);
	}
}

