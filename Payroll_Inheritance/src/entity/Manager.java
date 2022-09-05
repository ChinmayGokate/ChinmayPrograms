package entity;

public class Manager extends Employee {

	double projectAllowance;

	
	  public Manager(int id, String name, double basicSalary, double hRAPer, double
	  dAPer, double projectAllowance)
	  { 
		  super(id,name,basicSalary,hRAPer,dAPer);
		  this.projectAllowance = projectAllowance; 
	  }
	 

	public double calculateGrossSalary() {
		return super.calculateGrossSalary() + projectAllowance;

	}

	/*Instead of creating the constructor of super class you can directly initialize values by this keyword -- like that and remove super class constructor
	 * public Manager(int id, String name, double basicSalary, double HRAPer, double
	 * DAPer, double projectAllowance) { this.id=id; this.name=name;
	 * this.basicSalary=basicSalary; this.HRAPer=HRAPer; this.DAPer=DAPer;
	 * this.projectAllowance = projectAllowance; }
	 */
}
