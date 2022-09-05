package entity;

public class Employee 
{
	int id;
	String name;
	double basicSalary;
	double HRAPer;
	double DAPer;
	double grossSalary;
	
	
	  public Employee(int id, String name, double basicSalary, double HRAPer,
	  double DAPer) { this.id = id; this.name = name; this.basicSalary =
	  basicSalary; this.HRAPer = HRAPer; this.DAPer = DAPer; }
	


	public double calculateGrossSalary()
	{
		grossSalary=basicSalary +HRAPer +DAPer;
		return grossSalary;
		
	}
}
