package util;

import entity.Employee;
import entity.Manager;
import entity.Sourcing;
import entity.Trainer;

public class TaxUtil 
{
	public double calculateTax(Employee e)
	{
		double b1=e.calculateGrossSalary();
		  if(b1>=30000) 
		  {
			  return (b1*0.20); 
		  }
		  else 
		  {
			  return (b1*0.05);
		  }
	}
	public double calculateTax(Manager m)
	{
		double b1=m.calculateGrossSalary();
		  if(b1>=30000) 
		  {
			  return (b1*0.20); 
		  }
		  else 
		  {
			  return (b1*0.05);
		  }
	}
	public double calculateTax(Trainer t)
	{
		double b1=t.calculateGrossSalary();
		  if(b1>=30000) 
		  {
			  return (b1*0.20); 
		  }
		  else 
		  {
			  return (b1*0.05);
		  }
	}
	public double calculateTax(Sourcing s)
	{
		double b1=s.calculateGrossSalary();
		  if(b1>=30000) 
		  {
			  return (b1*0.20); 
		  }
		  else 
		  {
			  return (b1*0.05);
		  }
	}
}
