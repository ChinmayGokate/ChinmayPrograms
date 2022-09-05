package entity;

public class Sourcing extends Employee
{
	
	int enrollmentTarget;
	int enrollmentReached;
	double perkPerEnrollment;
	
	
	public Sourcing(int id, String name, double basicSalary, double hRAPer, double dAPer, int enrollmentTarget,
			int enrollmentReached, double perkPerEnrollment) {
	
									super(id,name,basicSalary,hRAPer,dAPer);
									this.enrollmentTarget = enrollmentTarget;
									this.enrollmentReached = enrollmentReached;
									this.perkPerEnrollment = perkPerEnrollment;
								}
	
	
	public double calculateGrossSalary()
	{
		return super.calculateGrossSalary()+((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment;
		
		
	}
}
